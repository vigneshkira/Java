package com.demo;

import java.util.Arrays;

public class StringManipulation {
	
    public static void main(String args[]) {
    	String name = "Vicky ";
    	String obj = new String("Vicky");
//    	obj = "Vicky";
    	
    	System.out.println(name);
    	System.out.println(name == obj );
    	System.out.println(name.equals(obj)); 
    	System.out.println(name.toLowerCase());
    	System.out.println(name.toUpperCase());
    	System.out.println(name.charAt(1)); // to get the index value
    	char b = name.charAt(0);
    	System.out.println(b);
//    	System.out.println(name.indexof(0,3));
    	System.out.println(name.substring(0,3));
    	char[] a = name.toCharArray();
    	System.out.println(name.toCharArray());
    	System.out.println(a);
    	System.out.println(name.split("i"));
        String[] d = name.split("");
    	System.out.println(Arrays.toString(d));
    	System.out.println(name.trim());
    	System.out.print(name.isBlank());
    	System.out.print(name.isEmpty());
    	System.out.println(name.concat("das"));
    	System.out.println(name.replace("ic", " "));
    	System.out.println(name.replaceAll("Vicky", "Vignesh"));


    }
	

}
