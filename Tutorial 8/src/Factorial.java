import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a number to find its factorial");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int t=FactorialMain.facto(n);
	    System.out.println(t);
	}

}
