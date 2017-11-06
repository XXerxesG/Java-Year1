import java.util.Scanner;

public class Shapes {
     public static void main(String args[]){
            Scanner s= new Scanner(System.in);
            System.out.println("Enter the height");
            int h=s.nextInt();
            System.out.println("Enter the Width");
            int w=s.nextInt();
        /*//TO MAKE A RECTANGLE/Sqaure
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++){
                if(i==0||i==h-1||j==0||j==w-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println("");
        }*/
       // To MAKE a Triangle
       /*for(int i=0;i<h;i++){
           for(int j=0;j<i;j++){
               if(i==0||i==h-1||j==0||j==i-1)
                System.out.print("*");
                else
                System.out.print(" ");
           }
            System.out.println("");
       }*/
       /*
       //To make a reverse triangle
          for(int i=h;i>0;i--){
           for(int j=0;j<i;j++){
               
                System.out.print("*");
           }
             
            System.out.println("");
       }*/
      //To make a mirr Triangle
         for(int i=w;i>w;i--){
           for(int j=h;j>0;j--){
               
                System.out.print("*");
                
           }
            System.out.println("");
       }
     }
    
}
