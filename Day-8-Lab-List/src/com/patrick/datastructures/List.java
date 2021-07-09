package com.patrick.datastructures;

public class List {
	
		  private String[] elements = new String[8];
		
		  public String get(int index){
			    return this.elements[index];
			  }
		  public void set1(int index, String value){
			    this.elements[index] = value;   
		  }
		     public void set(int index, String value){
		    this.elements[index] = value;
		    
		    public String remove() {
		        int index = -1;
		        String value = "";
		    
		        //loop through list backwards and remove last element
		        for (int i = elements.length-1; i >= 0; i--) {
		            if (null != elements[i]) {
		                index = i;
		                value = elements[i];
		                elements[i] = null;
		                break;
		            }
		        }
		     
		        //return early if index is still -1 (empty list)
		        if (index == -1){
		            return value;
		        }
		    
		        //check if we need to decrease the size of the elements array
		        if (index % 8 == 0 && elements.length > 8 &&   elements.length > index){
		            String[] temp = new String[index];
		     
		            for (int i = 0; i < temp.length; i++) {
		            temp[i] = elements[i];
		            }
		    
		            //copy temp to elements variable
		            elements = temp;
		        }
		    
		        return value;
		    }
}
