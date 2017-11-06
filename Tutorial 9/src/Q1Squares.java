import java.util.Scanner;
public class Q1Squares {

	public static void main(String[] args) {
	 Scanner s= new Scanner(System.in);
	 System.out.println("enter a number to find its square");
	 int a=s.nextInt();
	 int ans =square(a);
	 System.out.println(ans);
	}
 public static int square(int n){//2;4
	 if(n==1){
		 return 1;
	 }
	 else{
		 return square(n-1)+2*n-1;//(1)+3;(3)+7,
	 }
 }
 
}
/*3 square = 9
 * 2 s
 *
*/