
public class SwitchStatement {

	public static void main(String[] args) {
        int x = 5;

        switch(x) {
        	//case 10: System.out.println("case 10 ran");
        	// add a default case
        	//default: System.out.println("The default case ran.");
        	
        	// fall-through 
        	default: System.out.println("The default case ran.");
			case 10: System.out.println("case 10 ran");
        }
    }
}
