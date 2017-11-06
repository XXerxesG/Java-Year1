
import java.util.Scanner;
public class T3Q09 {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter four numbers");
		int a=m.nextInt();
		int b=m.nextInt();
		int c=m.nextInt();
		int d=m.nextInt();
        System.out.println("The descending order is");
		if(a>b&&a>c&&a>d)//finds if a is the greatest{
        	System.out.println(a);
        	if(b>c){
        	       if(b>d){
        	    	   System.out.println(b);
        	    	   if(d>c){
        	    		   System.out.println(d);
        	    		   System.out.println(c);
        	    	   }
        	    	   else{
        	    		   System.out.println(c);
        	    		   System.out.println(d);
        	    	   }
        	       }
        	       else if(d>b){
        	    	   System.out.println(d);
        	    	   if(b>c){
        	    		   System.out.println(b);
        	    		   System.out.println(c);
        	    	   }
        	    	   else{
        	    		   System.out.println(c);
        	    		   System.out.println(b);
        	    		   
        	    	   }
        	       }
        	     
        	       
        	       
        	       
         	}
        	
        	
	}
        
	}


