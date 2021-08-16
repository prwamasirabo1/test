package Service;

import java.util.Map;

import Transaction.Transactions;

public interface InterfaceServices {

	public boolean insertUser(Transactions user);

	public Transactions getUser(String name);

	public boolean refreshUser(Transactions user);

	 public abstract Map<String, Transactions> getAll();
	 
	 
}
