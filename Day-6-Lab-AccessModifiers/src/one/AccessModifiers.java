package one;

import two.ProtectedSubClass;

public class AccessModifiers {
	
	
	//access class methods here
	public static void main(String [] args) {
    Person adam = new Person();
    adam.age = 15;

    System.out.println(adam.age);
    
    ProtectedSubClass psc = new ProtectedSubClass();
    psc.printID();
}

}
