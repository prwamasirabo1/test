package com.patrick.com;
import java.util.Scanner; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.sql.Statement;
public class ConnectDB {
	
	public static void main (String[] arg) {
		/* declare jdbcURL to connect to the database Bank_Patrick database
		 * username and password for the database are declared, and the local host is my computer. 
		 */		
		
	//String jdbcURL = "jdbc:postgresql://127.0.0.1:5432/Bank_Patrick";
		
	Scanner input= new Scanner(System.in); 
	String user, pass; 
	
	System.out.print("Enter your username: ");
	user = input.nextLine();
	
	System.out.print("Enter your password:");
    pass = input.nextLine(); 
    
    if(user.equals("Patrick") && (pass.equals("rwama"))) {
    	System.out.println("Welcome Patrick to Our banking Systm"); 
    }else {
    	System.out.println("Sorry try Again later !!!");
    }


	Properties props = new Properties();
	props.setProperty("user", "postgres");
	props.setProperty("password", "Widetechchf01!");
	props.setProperty("ssl","true");
	
	 
		try {
		
			Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","Widetechchf01!");
			System.out.println("Connection Established"); 
			
						
			{		      
	          //String sql = "CREATE TABLE REGISTRATION " +
	                //  "(id INTEGER not NULL, " +
	                //  " first VARCHAR(255), " + 
	                //  " last VARCHAR(255), " + 
	                //   " age INTEGER, " + 
	                 //  " PRIMARY KEY ( id ))"; 
	          //String sql1 = "create table app_users " + 
	                  // "( id int generated always as identity ( cache 10 ) primary key," +
	                 //   "username text not null unique, " +
	                  //  "password text not null )";
	          
	         // String sql2 = "CREATE TABLE Customer " +
	                   // " (customer_id INTEGER not Null, " +
	                   // " email VARCHAR(255),"+
	                   // "login_id INTEGER not Null)";
	          
	          //String sql3 = "CREATE TABLE Account " +
	                  //  " (id INTEGER not Null, " +
	                  //  " account_no VARCHAR(255),"+
	                  //  " name VARCHAR(255),"+
	                  //  " new_balance VARCHAR(255),"+
	                  //  "customer_id VARCHAR (255))";
	          
	         // String sql4 = "CREATE TABLE Employee " +
	                   // " (employee_id INTEGER not Null, " +
	                   // " email VARCHAR(255),"+
	                   // " join_date DATE,"+
	                  //  "login_id INTEGER not Null)";
	          
	         // String sql5 = "CREATE TABLE Transaction (account_id INTEGER not Null)";
	          
	          Statement stmt = connection.createStatement();
	          
	         //stmt.executeUpdate(sql);
	         //stmt.executeUpdate(sql1);
	        // stmt.executeUpdate(sql2);
	        // stmt.executeUpdate(sql3);
	        // stmt.executeUpdate(sql4);
	        // stmt.executeUpdate(sql5);
	         
	         System.out.println("Created table in given database...");
	     	connection.close();
				
		} 
			
		}catch(SQLException e) {
			System.out.println("Error in connecting to the database");
			e.printStackTrace(); 
		}
	}
}