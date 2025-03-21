package demo_1;

public class multilevelinhertanceday  {
    public static void main(String [] args) {
  
    	Markdetails md = new Markdetails();
    	details d = new details();
    	
    	d.display();
        md.totalmark();
 
    }
}

class School  {
	String name = "Vignesh";
	int rollnum = 57;
	int mark1 = 80,mark2 = 70,total ;
}



class details extends School { 
    void display() { 
        System.out.println(name);
        System.out.println(rollnum);
        
    }
}

class Markdetails extends School { 
    void totalmark() { 
    	total = mark1+mark2;
        System.out.println("Total mark:"+total);
    }
}
