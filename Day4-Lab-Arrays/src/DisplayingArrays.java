
public class DisplayingArrays {
	public static void main(String[] args) {
	    int[] intArray = new int[3];
	    intArray[0] = -5123;
	    intArray[2] = 32;
	    
	    //System.out.println(intArray);
	    //System.out.println(intArray[0]);
	    //System.out.println(intArray[1]);
	    System.out.println(intArray[3]);
	    /* ArrayIndexOutOfBoundsException and 
	     * the index that was attempted is 3.
	     * This error simply means that 
	     * you're accessing a position not defined by the array
	     * 
	     */
	  }
}
