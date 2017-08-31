
public class ThreadDemo extends Thread{
	private int counter;
	public void run(){
		synchronized(this){
			System.out.println("before notification");
			try {
				this.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.notifyAll();
			System.out.println("notified");
		}
	}
	public static void main(String args[]){
		System.out.println("main started");
		ThreadDemo job=new ThreadDemo();
		job.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(job){
			try {
				job.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finished everything");
		}
	}
//Program will wait for ever since the notifyAll is called first, then only the wait is coming
}
