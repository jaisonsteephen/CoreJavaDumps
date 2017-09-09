package com.dboperations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*create or replace procedure proce1(email2 in varchar2,idout out number)
is 
cnumber number;
  CURSOR c1
  IS
    SELECT id FROM address where email=email2;
BEGIN
  OPEN c1;
  FETCH c1 INTO cnumber;
  IF c1%notfound THEN
    cnumber:=9999;
  END IF;
  INSERT INTO test
    (id,name
    ) VALUES
    (cnumber,'PE'
    );
    idout:=cnumber;
  CLOSE c1;
END;*/
public class StoredProceduceExeFromJava {

	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "jaison";
	private static final String DB_PASSWORD = "Dhanya123";

	public static void main(String[] argv) {

		try {

			callOracleStoredProcOUTParameter();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void callOracleStoredProcOUTParameter() throws SQLException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;

		String getDBUSERByUserIdSql = "{call proce1(?,?)}";

		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(getDBUSERByUserIdSql);

			callableStatement.setString("email2", "jerin@gmail.com");
			callableStatement.registerOutParameter("idout", java.sql.Types.INTEGER);
			callableStatement.executeUpdate();
			
			int id = callableStatement.getInt("idout");
			System.out.println(id);

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (callableStatement != null) {
				callableStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
				DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}