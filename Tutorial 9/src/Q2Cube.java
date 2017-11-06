import java.util.Scanner;
public class Q2Cube {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 System.out.println("enter a number to find its cube");
		 int a=s.nextInt();
		 int ans =cube(a);
		 System.out.println(ans);

	}
 public static int cube(int n){
	  if(n==1){
		  return 1;
	  }
	  else{
		  return cube(n-1)+3*(Q1Squares.square(n))-3*n+1;
	  }
 }
}
