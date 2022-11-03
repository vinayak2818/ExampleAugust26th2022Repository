package com.sgtesting.DBdemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class StatementDemoForSQLStatements {

	public static void main(String[] args) {
		getRecordsFromDatabase();
			//insertRecords();

	}
	private static void getRecordsFromDatabase()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			System.out.println("Connection has successful!!!");
			Statement stmt=conn.createStatement();
			String strQuery="select * from students";
			ResultSet rs=stmt.executeQuery(strQuery);
			ResultSetMetaData rsmeta=rs.getMetaData();
			String colname1=rsmeta.getColumnName(1);
			String colname2=rsmeta.getColumnName(2);
			String colname3=rsmeta.getColumnName(3);
			System.out.printf("%-12s",colname1);
			System.out.printf("%-12s",colname2);
			System.out.printf("%-12s",colname3);
			System.out.printf("\n");
			while(rs.next())
			{
				String deptnumber=rs.getString("ID");
				String deptname=rs.getString("NAME");
				String location=rs.getString("FIELD");
				System.out.printf("%-12s",deptnumber);
				System.out.printf("%-12s",deptname);
				System.out.printf("%-12s",location);
				System.out.printf("\n");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	private static void insertRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			Statement stmt=conn.createStatement();
			String strQuery="insert into dept2 values(80,'INSURANCE','BANGALORE')";
			stmt.executeUpdate(strQuery);
			System.out.println("Inserted the records successfully!!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

}
