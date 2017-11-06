import java.util.Scanner;
public class Q5Harmonic {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter a number to get its harmonic");
	 int n=s.nextInt();
	 System.out.println("The Harmonic of "+n+" is "+har(n));
	}
	public static double har(int a){
		double h=1;
		for(int i=2;i<=a;i++){
			h=h+1.0/i;
		}
		return h;
	}
}
