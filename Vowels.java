package Task;

import java.util.Scanner;  // Import the Scanner class

public class Vowels {
	public static void main(String args[]) {
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter the name :");
     String name = scan.nextLine();
     
     
 
     
//    System.out.println(name.length());
    
    
     
     int n=0;
     
     for (int i = 0; i<name.length();i++) {
    	 
    	  
    	 char ch = name.charAt(i);
         if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch== 'u'){
        	
        	 	
        	 System.out.println("The Vowels occurs in "+ch);

        	 	 

         }
        
         
     }
    
     
	}

}
