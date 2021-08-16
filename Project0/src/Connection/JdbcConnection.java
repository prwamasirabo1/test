package Connection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.DriverManager;


public class JdbcConnection 
{
	public static Connection getConnection() 
	{
		 FileInputStream fis = null;
		try {
			fis = new FileInputStream("connection.properties");
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
			e.printStackTrace();
		} 
	        Properties p=new Properties (); 
	        try {
				p.load (fis);
			} catch (IOException e) {
				System.out.println("Unable to load file");
				e.printStackTrace();
			} 
	        String dname= (String) p.get ("driver"); 
	        String url= (String) p.get ("url"); 
	        String username= (String) p.get ("postgres"); 
	        String password= (String) p.get ("Widetechchf01!"); 
	        try {
				Class.forName(dname);
			} catch (ClassNotFoundException e) {
				System.out.println("Error found");
				e.printStackTrace();
			} 
	        Connection con = null;
			try {
				con = DriverManager.getConnection( 
				        url, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			} 
	        return con;
	}
}


