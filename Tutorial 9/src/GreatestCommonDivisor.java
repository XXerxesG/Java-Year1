import java.util.Scanner;
public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number 1");
		int n1=s.nextInt();
		System.out.println("Enter nnumber 2");
		int n2=s.nextInt();
		int ans=gcd(n1,n2);
		System.out.println(ans);
	}
	public static int gcd(int m,int n){
		if(n==m){
			return m;
		}
	
   else if (n>m)
	{
		return gcd(n-m,m);
	}
	else 
	{	
		return gcd(n,m-n);
	}

	}

}
