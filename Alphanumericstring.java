package assignment;

public class Alphanumericstring {

	    static String getNbr(String str) 
	    { 
	       str = str.replaceAll("[^\\d]", " "); 
	        str = str.trim(); 
	         str = str.replaceAll(" +", " "); 
	  
	        return str; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String str = "texte321 paragraphe12 569 lorem"; 
	        System.out.print(getNbr(str)); 
	    } 
	}
