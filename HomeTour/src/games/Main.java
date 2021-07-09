package games;
import java.util.Scanner;


public class Main {
	
	 private static String gonorth;
	private static String gosouth;
	private static String goest;
	private static String gowest;

	public static void main(String[] args) {
		
		String name = "Patrick's Home Tour" +"\r\n" ; 
		
		String shortDesc = "\r\n" +"You are most welcome to visit our house !!: " + "\r\n"; 
		
		String longDesc ="\r\n" + "You will want to make sure you’re following up on any questions "
				+ "\n"+ "or concerns you have after remotely touring the house, and if you’re "
				+ "\n"+ "on a tour for 30 minutes or more (which is distinctly possible), "
				+ "\n" +"you might forget some of the "
				+ "questions that arose during the beginning of the tour "
				+ "\n"+ "— so take notes." + "\r\n";
		
		System.out.println(name + shortDesc+ longDesc);
		
		@SuppressWarnings("resource")
		Scanner myObject = new Scanner(System.in);  {
		System.out.println("Enter your Access number to visit your home tour ");
			
		String codeNumber = myObject.nextLine();
		System.out.println(codeNumber); 
		}
		System.out.println("Access accepted : " + "\n");
	   System.out.println("Welcome to the House! Which way do you want to go?");
	 //}}
System.out.println("Please select the following navigation keywords : go north, go south, go east and go west");
//System.out.println();
System.out.println("Please Enter your keyword:");
//Scanner sc= new Scanner(System.in);
System.out.print("");
Object answer = "not avilable";
//System.out.print("You have entered: "+ == go North str); 
Scanner Scan = new Scanner(System.in);
String input = Scan.nextLine();
String text; 

do {


  input.equals ("go north"); 
    System.out.println("Welcome to the the north of the hourse : There are two rooms both on left and right "
    		+ "\n"+ "on your left side There is a guest room with its bathroom and on right there is a "
    				+ "sitting room!");
    gonorth = Scan.nextLine();
//}
 input.equals ("go south"); 
        System.out.println("Welcome to the south of the house where there two parts: A south east room is a "
        		+ "\n"+ "kitchen while south easter there is a dinnining room.");
        gosouth = Scan.nextLine();
input.equals ("go northupstairs");
    System.out.println("Welcome to northup stairs rooms where northeast there is a master bed room while the "
    		+ "opposite side there is a children room");
    goest = Scan.nextLine();

input.equals ("go southupstairs"); //) {
    System.out.println("Welcome to the rooms which are located on upstairs : upstairs south there is a bothroom "
    		+ "\n" +"and the bithroom is shared by those two rooms updastairs");
    gowest = Scan.nextLine();
}
 while (answer.equals("exit"));
	}

	void close() {
	}
}
