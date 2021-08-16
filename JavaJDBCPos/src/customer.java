import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class customer {
	
	private static String firstName; 
	private String lastName; 

	
	public customer (String firstaName, String lastName) {
		this.firstName = firstName; 
		this.lastName = lastName ; 
		
	}
public customer() {
}
public static void getFirstName() {
	//try {
		//return firstName;
	//} catch (Exception e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
	//}
}
public void setFirstName (String firstName) {
	this.firstName= firstName; 
}
public String getLastName() {
	return lastName;
}
public void seLastName(String lastName) {
	this.lastName= lastName; 
}
}


 