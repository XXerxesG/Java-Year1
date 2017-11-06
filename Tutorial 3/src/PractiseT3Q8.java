import java.util.Scanner;


public class PractiseT3Q8 {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=m.nextInt();
		int b=m.nextInt();
		int c=m.nextInt();
       //Descending---------------------------------------------------------------------------
		System.out.print("Descending \t");
		if(a>b && a>c){
        	System.out.print(a+"\t");
        	    if(b>c){
        	    	System.out.print(b+"\t");
        	    	System.out.print(c+"\t");
        	    	System.out.print("-------------Ascending-----------");
        	    	System.out.print(+c+"\t" +b+ "\t" +a);
        	    	
        	    }
        	    else{
        	    	System.out.print(c+"\t");
        	    	System.out.print(b+"\t");
        	    	System.out.print("-------------Ascending-----------");
        	    	System.out.print(+c+"\t"  +a+ "\t" +b);
        	    }
        }
		else if(b>a&&b>c){
			 if(a>c){
     	    	System.out.print(a+"\t");
     	    	System.out.print(c+"\t");
     	    	System.out.print("-------------Ascending-----------");
    	    	System.out.print(+c+"\t"  +a+ "\t" +b);
     	    }
     	    else{
     	    	System.out.print(c+"\t");
     	    	System.out.print(a+"\t");
     	    	System.out.print("-------------Ascending-----------");
    	    	System.out.print(+a+ "\t" +c+ "\t" +b);
     	    }
		}
		else{
			System.out.print(c);
			 if(a>b){
     	    	System.out.print(a+"\t");
     	    	System.out.print(b+"\t");
     	    	System.out.print("-------------Ascending-----------");
    	    	System.out.print(+b+ "\t" +a+"\t"  +c);
     	    }
     	    else{
     	    	System.out.print(b+"\t");
     	    	System.out.print(a+"\t");
     	    	System.out.print("r-------------Ascending-----------");
    	    	System.out.print(+a+ "\t" +b+"\t"  +c);
     	    }
		}

	
	
	}
	

}
