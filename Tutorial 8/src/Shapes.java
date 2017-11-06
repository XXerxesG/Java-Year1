import java.util.Scanner;
public class Shapes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to draw a Square");
		int t=s.nextInt();
		Square.sq(t);
		System.out.println("");
		for(int i=0;i<t;i++)
			if(i==0||i==t-1){
				HollowSquare.ln(t);
				 System.out.println(" ");
			}
			else{
				HollowSquare.sp(t);
				 System.out.println(" ");
			}	 
		
	}

}
