import java.util.Scanner;

public class Q3Multiplication {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 System.out.println("enter a number ");
		 int a=s.nextInt();
		 System.out.println("Enter a another number");
		int b=s.nextInt();
		 int ans =mult(a,b);
		 System.out.println(ans);
	}
	//3x2=3+3;3x4=3+3+3+3
	public static int mult(int m,int n){
		if(n==0){
			return 0;
		}
		else{
			return m+mult(m,n-1);
		}
	}

}
