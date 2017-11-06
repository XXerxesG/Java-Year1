import java.util.Scanner;
public class PrimeNumber {
 public static void main(String[] args){
	 Scanner s=new Scanner(System.in);
			 System.out.println("Enter a number to check Prime");
	int a=s.nextInt();
			 boolean ans=prime(a);
		System.out.println(ans);	 
 }
 public static boolean prime(int n){
	 return prime(n,n-1);
 }
 public static boolean prime(int thenum,int changingnum){
	 if(changingnum==1) return true;
	 else if(thenum%changingnum==0)return false;
	 else
      return prime(thenum,changingnum-1);
 }
}
