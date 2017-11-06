import java.util.Scanner;
public class MathFunctions {

	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 numbers ");
        int k=s.nextInt();
        int l=s.nextInt();
        System.out.println(f(k,l));//4+2
        System.out.println(g(k,l));//4-2
        System.out.println(q(k,l));//4+2*4-2
        System.out.println(w(k,l));//2*4+2
	}
   public static int f(int a,int b){
	   return a+b;
			  
   }
   public static int g(int a,int b){
	   return a-b;
   }
   public static int q(int a,int b){
	return f(a,b)*g(a,b)   ;
   }
   public static int w(int a,int b){
	   return (2*a)+b;
   }
}
