import java.util.Scanner;
public class Tutorial5_4 {
     public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    //TO Create a Harmonic 1+1/2+1/3....
    System.out.println("Enter the number to which to get a Harmonic");
    int n=s.nextInt();
    double har=0;
    for(int i=1;i<=n;i++){
     har=har+1.0/i;    
     }
         System.out.println(har);
     } 
}
