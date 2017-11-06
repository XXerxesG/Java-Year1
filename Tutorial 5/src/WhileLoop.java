import java.util.Scanner;
public class WhileLoop {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a number");
        int n =s.nextInt();
        int i=1;
        while(i<=n){
            System.out.println("This is Line"+i);
            i++;
                    
        }
    }
    
}
