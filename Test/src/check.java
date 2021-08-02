

import java.util.Arrays;
	import java.util.Collection;
	import java.util.Comparator;
	import java.util.HashMap;
	import java.util.Map;
	import java.util.SortedSet;
	import java.util.TreeSet;

public class check {

	    static class Sorter {
	        public final String name;
	        public final int score;
	        public Sorter(String name, int score) {
	            this.name = name;
	            this.score = score;
	        }
	        @Override
	        public String toString() {
	            return "(" + name + ", " + score + ")";
	        }
	    }

	    public static void main(String[] args) {
	    	
	    	
	    	// No need to mention the
	        // Generic type twice
	        HashMap<Integer, String> group1 = new HashMap<>();
	  
	        // Initialization of a HashMap
	        // using Generics
	        HashMap<Integer, String> group2
	            = new HashMap<Integer, String>();
	  
	        // Add Elements using put method
	        group1.put(1, "Patrick");
	        group1.put(2, "Christopher");
	        group1.put(3, "Amina");
	  
	        group2.put(4, "John");
	        group2.put(5, "Smith");
	        group2.put(6, "josephine");
	  
	        System.out.println("Group 1 : "
	                           + group1);
	        System.out.println("Group 2 : "
	                           + group2);
	    }
	    	
	    	
	    	
	    	
	        Collection<Sorter> Sorter = Arrays.asList(
	            new Sorter("Patrick", 85),
	            new Sorter("Christopher", 89),
	            new Sorter("Amina", 100),
	            new Sorter("Sean", 85),
	            new Sorter("Bob", 94),
	            new Sorter("Charlie", 72)
	        );

	        SortedSet<SortedSet<Sorter>> sortedGroups = sortThings(Sorter);

	        //System.out.println(sortedGroups);
	    //}

	    private static SortedSet<SortedSet<Sorter>> sortThings(Collection<Sorter> things) {
	        final Comparator<Sorter> compareThings = new Comparator<Sorter>() {
	            public int compare(Sorter a, Sorter b) {
	                String aname = a.name;
	                String bname = b.name;
	                return aname.compareTo(bname);
	            }
	        };

	        // first pass
	        Map<String, SortedSet<Sorter>> groups = new HashMap<String, SortedSet<Sorter>>();
	        for (Sorter obj: things) {
	            SortedSet<Sorter> group = groups.get(obj.name);
	            if (group == null) {
	                group = new TreeSet<Sorter>(compareThings);
	                groups.put(obj.name, group);
	            }
	            group.add(obj);
	        }

	        // second pass
	        SortedSet<SortedSet<Sorter>> sortedGroups = new TreeSet<SortedSet<Sorter>>(new Comparator<SortedSet<Sorter>>() {
	            public int compare(SortedSet<Sorter> a, SortedSet<Sorter> b) {
	                return compareThings.compare(a.last(), b.last());
	            }
	        });
	        sortedGroups.addAll(groups.values());
	        return sortedGroups;
	    }

	}

