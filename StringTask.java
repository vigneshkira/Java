package Task;

import java.util.Scanner;  // Import the Scanner class

public class StringTask {
	public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter the name :");
     String name = scan.nextLine();
     
     
 
     
//    System.out.println(name.length());
    
    
  
     
     System.out.println("Enter the Value :");
     char letter = scan.next().charAt(0);
     
     char[] a = name.toCharArray();
     
     
     int n=0;
     
     for (int i = 0; i<name.length();i++) {
    	 
    	  
         if( name.charAt(i) == letter){
        	
        	 	
        	 	n++;// to get the index value
        	 	 

         }
        
     }
     System.out.println("The letter occurs in "+n+" times");

     
	}

}
