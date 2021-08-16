import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Service {

	
	int AddAccount(String firstName, String lastName, String ssn, String accountType, Double balance) {
		int userId = -1; 
		int accountId= -1; 
		Connection connection = connect();
		
		try {
			// Add User  
			connection.setAutoCommit(false);
			String addUserSql= "Insert into users (FirstName, LastName, SSN) values(?,?,?)";
			PreparedStatement addUser  = connection.prepareStatement(addUserSql, Statement.RETURN_GENERATED_KEYS);
		    addUser.setString(1, firstName);
		    addUser.setString(2, lastName);
		    addUser.setString(1, ssn);
		    addUser.executeUpdate();
		    ResultSet addUserResults= addUser.getGeneratedKeys();
		    if (addUserResults.next()) {
		    	userId= addUserResults.getInt(1);
		    }
		    
		    //Add Account
		    
		    String addAccountSql= "Insert into accounts (Type, Balnce) values(?,?)";
		    PreparedStatement addAccount = connection.prepareStatement(addUserSql, Statement.RETURN_GENERATED_KEYS);
		    addAccount.setString(1, accountType);
		    addAccount.setDouble(2,balance); 	
		    addAccount.executeUpdate(); 
		    ResultSet addAccountResults= addAccount.getGeneratedKeys();
		    if (addAccountResults.next()) {
		    	accountId= addAccountResults.getInt(1);
		    }
		    
		    //Link User to Account
		    if(userId> 0 && accountId>0) {
		    
		    	String linkAccountSql= "Insert into mappings(UserId, AccountId) values(?,?)";
				PreparedStatement linkAccount  = connection.prepareStatement(linkAccountSql);
				linkAccount.setInt(1, userId);
				linkAccount.setInt(2, accountId);
				linkAccount.executeUpdate();
				connection.commit(); 
		    }
		    else {
		    	connection.rollback();
		    }
		    connection.close();
		} catch (SQLException ex) {
			System.err.println ("An error has occured: "+ ex.getMessage());
		}
		
		return accountId; 
	}

	private Connection connect() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
