package com.pkr;
import java.sql.*;

import oracle.jdbc.OracleDriver;

public class OracelJdbc {

	public static void main(String[] args)
	{
		try {
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded successfully");
			Connection ce=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orcl", "system", "1001");
			System.out.println("connection established succesfully");
			Statement st=ce.createStatement();
			ResultSet result=st.executeQuery("select * from EMPLOYEE");
			while(result.next())
			{
				String fname=result.getString("FNAME");
				System.out.println(fname);
			}
			ce.close();
		}
		catch(Exception e)
		{
			System.out.println("Exception in try block"+e.getMessage());
		}
	}
}
