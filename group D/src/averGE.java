
import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Map.Entry;
	import java.util.Scanner;
	import java.util.Set;
public class averGE {

		    public static void main(String[] args) {
	        HashMap<String, Integer> batch1Term1 = new HashMap<>();
	        HashMap<String, Integer> batch1Term2 = new HashMap<>();
	        HashMap<String, Integer> batch1Term3 = new HashMap<>();
	        Scanner in = new Scanner(System.in);
	        
	        System.out.println("Enter the number of students in batch1:");
	        int n = in.nextInt();
	        System.out.println("Enter the name and score of students in batch 1:");
	        
	        for (int i =0; i < n; i++) { 
	          
	            String a = in.next();
	            Integer b = in.nextInt();
	          

	            batch1Term1.put(a, b);
	        }

	      /*  System.out.println("Enter the number of students in batch1Term2:");
	        n = in.nextInt();
	        System.out.println("Enter the name and score of students in batch1Term2:");
	        
	        for (int i =0; i < n; i++) { 
	          
	            String a = in.next();
	            Integer b = in.nextInt();
	          

	            batch1Term2.put(a, b);
	        }*/
	       /* 
	        
	        System.out.println("Enter the number of students in batch1Term3:");
	        n = in.nextInt();
	        System.out.println("Enter the name and score of students in batch1Term3:");
	        
	        for (int i =0; i < n; i++) { 
	          
	            String a = in.next();
	            Integer b = in.nextInt();
	          

	            batch1Term3.put(a, b);
	        }
	        */
	        System.out.println("Printed without sorting");
	        for (Map.Entry<String, Integer> m : batch1Term1.entrySet()) {
	        System.out.println( m.getKey() + " " + m.getValue());
	        }
	        System.out.println("   ");
	        
	        Set<Entry<String, Integer>> entrySet = batch1Term1.entrySet();
	        
	        List<Entry<String, Integer>> list = new ArrayList(entrySet);
	        
	        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
	            

	            @Override
	            public int compare(Entry<String, Integer> o2, Entry<String, Integer> o1) {
	                // TODO Auto-generated method stub
	                return o1.getValue().compareTo(o2.getValue());
	            }
	         });
	        System.out.println("Printed with sort according to score:");
	        list.forEach(s->{
	            System.out.println(s.getKey() + " " + s.getValue());
	        });
	        
	      /*  for (Map.Entry<String, Integer> m : batch1Term2.entrySet()) {
	            System.out.println(m.getKey() + " " + m.getValue());
	        }
	        
	          for (Map.Entry<String, Integer> m : batch1Term3.entrySet()) {
	            System.out.println(m.getKey() + " " + m.getValue());
	        }*/
	} 
	
}
