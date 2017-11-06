import java.util.Scanner;
public class Boolean {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
   /* int x=5,y=6,z=4;
	boolean a=z>y&&z>x;// So a will be true when z is greater than x and y
	boolean b=x>y||z>y;//So b will be true if either x or z greater than y 
    System.out.println(a);
    System.out.println(b);
	*/
	System.out.println("Enter three numbers");
	int x=s.nextInt();
	int y=s.nextInt();
	int z=s.nextInt();
	if(x>y&&x>z){
		System.out.println("The greatest number is " +x);
	}
	else if(y>x&&y>z){
		System.out.println("greatest is " +y);
	  
	}
	else{
		System.out.println("Greatest is "+z);
	}
	}
	

}
