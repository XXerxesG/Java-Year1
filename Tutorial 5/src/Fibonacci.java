import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Your number");
        int n=s.nextInt();
        double sum=0,fn=0,sn=1,tn=0;
        for (int i=0;i<n;i++)
        { 
          if (i<=1){
              tn=i;
          }
          else{
              sum=fn+sn;
              fn=sn;
              sn=sum;
              
            }
          System.out.println(sum);
       }
    }
    
}
