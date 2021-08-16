package com.widetech.JEETut3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TestSystem {
 private static EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
		    .createEntityManagerFactory("JEETut3"); 
 
	public static void main(String[] args) {
		addCustomer(1, "Sue", "Smith");
		addCustomer(2, "Sam", "Smith");
		addCustomer(3, "Sid", "Smith");
		addCustomer(4, "Sally", "Smith");
		getCustomer(1);
		getCustomers();
		changeFName(4,"Mark");
		deleteCustomer(3);
	
		
      ENTITY_MANAGER_FACTORY.close(); 

	}
public static void addCustomer(int id, String fname, String lname) {

	EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction et = null; 
	try {
		et= em.getTransaction(); 
		et.begin();
		Customer cust = new Customer();
		cust.setID(id);
		cust.setFName(fname);
		cust.setLName(lname);
		//em.persist(cust);
		//et.commit();
		}
	catch(Exception ex) {
		if(et !=null) {
			et.rollback();
		}
		ex.printStackTrace();
	}
}

public static void getCustomer(int id) {
	EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
	String query = "SELECT c FROM Customer c WHERE c.id= :custID"; 
	TypedQuery<Customer>tq = em.createQuery(query, Customer.class);
	tq.setParameter("CustID", id);
	Customer cust = null; 
	try {
		cust = tq.getSingleResult(); 
		System.out.println(cust.getFName()+ " " +
		                   cust.getFName()); 
		}
   catch(NoResultException ex) {
	   ex.printStackTrace();
}
	finally {
		em.close();
	}
}

public static void getCustomers() {
	EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
	String strQuery = "SELECT c FROM Customer c WHERE c.id IS NOT NULL";
    TypedQuery<Customer>tq = em.createQuery(strQuery, Customer.class);
    List<Customer> custs;
    try {
    	custs= tq.getResultList();
    	custs.forEach(cust->System.out.println(cust.getFName() +
    			"" + cust.getLName()));
    }

    catch(NoResultException ex) {
	   ex.printStackTrace();
    }
	finally {
		em.close();
	}
}
public static void changeFName(int id, String fname) {

	EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction et = null;
	Customer cust = null; 
	try {
		et= em.getTransaction(); 
		et.begin();
		cust = em.find(Customer.class, id);
		cust.setFName(fname);
		em.persist(cust);
		et.commit();
		}
	catch(Exception ex) {
		if(et !=null) {
			et.rollback();
		}
		ex.printStackTrace();
	}

finally {
	em.close();
}
}
public static void deleteCustomer(int id) {

	EntityManager em=ENTITY_MANAGER_FACTORY.createEntityManager();
	EntityTransaction et = null; 
	Customer cust = null;
	try {
		et= em.getTransaction(); 
		et.begin();
		cust = em.find(Customer.class, id);
		em.remove(cust);
		em.persist(cust);
		et.commit();
		}
	catch(Exception ex) {
		if(et !=null) {
			et.rollback();
		}
		ex.printStackTrace();
	}
}
}





