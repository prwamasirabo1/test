
	import java.util.Scanner;
//import java.beans.Statement;
import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	//import java.sql.Statement;
	import java.util.Properties;
//import java.util.Random;
	//import java.sql.Statement;

public class testing1 {
	
			
		public static void main (String[] arg) {
			/* declare jdbcURL to connect to the database Bank_Patrick database
			 * username and password for the database are declared, and the local host is my computer. 
			 */		
			
		//String jdbcURL = "jdbc:postgresql://127.0.0.1:5432/Bank";
			//testing1 obj_testing1 = new testing1(); 
			//System.out.println(obj_testing1.get_connection());
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
			
				Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Bank_Patrick","postgres","Widetechchf01!");
				System.out.println("Connection Established"); 
										
				//{		      
		        
					
		         
		         //System.out.println("Created table in given database...");
		     	connection.close();
					
			//} 
				
			}catch(SQLException e) {
				System.out.println("Error in connecting to the database");
				e.printStackTrace(); 
			}
		}

		//public Connection get_connection() {
			// TODO Auto-generated method stub
			//return null;
//		}

		
}	
//}