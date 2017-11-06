import java.util.Scanner;
public class MakinStars {
   public static void main (String[] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a Number");
       int n=s.nextInt();
       for (int i=0;i<=n;i++){
           System.out.println("*");
       }
       
       
   } 
}
