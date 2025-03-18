package com.demo;

public class Sample {

 public static void main(String[] args) {
	 
	 int a = 20;
	 int b = 30;
	 int c = a + b;
	 int d = a - b;
	 System.out.printf(" \n Addition \n"+ c);
	 System.out.printf("\n Substract \n"+ d);
	 
	 if(b >= 18)
	 {
		 System.out.printf("you  are eligible");
	 }
	 else
	 {
		 System.out.printf("you  are not eligible");

	 }

	 for (int i = 0; i < a; i++) {
		 if(i==9)
		 break;
	     System.out.printf("%d\n", i);  // "%d" is for integers, "\n" adds a newline.
		}
	 
	 int i = 0;
	 while (i < 5) {
	   System.out.println(i);
	   i++;	
	 }

	 
 }
	
}
