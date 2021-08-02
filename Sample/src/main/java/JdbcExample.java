import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {
	public static void main(String[] args) {
		//1. create connection 
		try (Connection conn= DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres", "Widetechchf01!")){
			
			//2. get statement object  
			Statement stmt = conn.createStatement();
			
			Statement stmt1 = null;
			//3. get resultset object 
			ResultSet rs = stmt1.executeQuery ("SELECT * FROM employee"); 
			while(rs.next()) {
				String name = rs.getString("name");
				System.out.println(name); 
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}			
		}
static void readData(Statement stmt) throws SQLException {
	ResultSet rs= stmt.executeQuery("SELECT * FROM employee");
	while(rs.next()) {
		String name= rs.getString("name"); 
		System.out.println(name); 
	}
}

}
