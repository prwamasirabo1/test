
public class StringConcatenation {
	public static void main(String[] args) {
        
		String beginning = "Hello";

        String end = " World";
        String combo = beginning + end;

        System.out.println(combo);
         //Adding a Primitive to a String
        long l = 203L;
        System.out.println("The value of l: " + l);
        //Adding Primitives to the Beginning of a String
        
        boolean b = true; 
        System.out.println(b+ " is true");
        //Order Matters
        
        int x = 2;
        int y = 3;
        System.out.println("The sum of x and y is " + x + y);
        
        //Changing Order
        //int x = 2;
        //int y = 3;
        System.out.println("The sum of x and y is " + (x + y));
       
        // Changing Order by Position
        //int x = 2;
        //int y = 3;
        System.out.println(x + y + " is the sum of x and y");
    }
}
