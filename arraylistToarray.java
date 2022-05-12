package assignment;
import java.util.*;

public class arraylistToarray {
	 public static void main(String[] args) {  
	       
	        List<String> fruitList = new ArrayList<>();  
	        fruitList.add("Mango");  
	        fruitList.add("Banana");  
	        fruitList.add("Apple");  
	        fruitList.add("Strawberry");  
	        fruitList.add("Pineapple");  
	      
	        String[] item = fruitList.toArray(new String[fruitList.size()]);  
	        for(String s : item){  
	            System.out.println(s);  
	        }  
	        List<String>l2 = new ArrayList<>();  
	        l2 =  Arrays.asList(item);  
	        System.out.println(l2);  
	    }  
	}  

