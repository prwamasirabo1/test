
public class LinearSearch {
	
	public static void main(String[] args) {
        //create some dummy data for our method
        char letter = 'o';

        //char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
  char[] letters= null; 
		  /*A NullPointerException is a common error 
		   * that occurs when a program tries to manipulate a value that is uninitialized
		   */
		        //call your methods here
        LinearSearch ls = new LinearSearch();

        System.out.println(ls.findIndex(letter, letters));
    }

    public int findIndex(char target, char[] data) {
        // to solve the above issue you will have to include the following statement
    	
    	if (data == null) return -1; // This approach is called making our program robust.
    	
    	int result = -1;

        //loop through the data
        for (int i = 0; i < data.length; i++) {
            char temp = data[i];

            //test current element against target
            if (temp == target) {
                return i;
            }
        }

        return result;
    }
}
