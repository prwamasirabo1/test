
public class additionalcasesbeforeandafterthedefaultcase {

	public static void main(String[] args) {
        int x = 5;

        switch(x) {
            case 6: System.out.println("case 6 ran");
            default: System.out.println("The default case ran.");
            case 7: System.out.println("case 7 ran");
            case 10: System.out.println("case 10 ran");
        }
    }

}
