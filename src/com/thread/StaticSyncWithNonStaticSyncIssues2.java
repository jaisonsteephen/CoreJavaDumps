package com.thread;

/**
 * 
 * @author jaison
 * 
 * Not yet find a proper solution for mixing static sync with non-static 
 *
 *	my_script.sh
 *  ------------
 *	#!/bin/bash
 *	sleep $2
 *	echo $1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticSyncWithNonStaticSyncIssues2 {
	// Issue --Static and non staic have no co-ordinate work
	ProcessBuilder processBuilder = null;
	Process process = null;
	static String x = "";

	void executeShellScript(String arg, String sleep) {
		synchronized (x) {
			processBuilder = new ProcessBuilder();
			processBuilder.command("/home/jaison/my_script.sh", arg, sleep);

			try {
				process = processBuilder.start();
			} catch (IOException e) {
			}
		}
	}

	String getResult() {
		synchronized (x) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			try {
				return reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		StaticSyncWithNonStaticSyncIssues2 m = new StaticSyncWithNonStaticSyncIssues2();
		m.executeShellScript("1", "0s");
		m.executeShellScript("4", "6s");
		m.executeShellScript("4", "3s");
		System.out.println(m.getResult());
	}

}