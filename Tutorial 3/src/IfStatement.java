import java.util.Scanner;
public class IfStatement {

	public static void main(String[] args) {
		//System.out.println("hello");
       /* int a=5;
        int b=4;
        boolean result;
        result=a<10;//checking a less than 10
        System.out.println(result);
        result=a==10;//checking is a=10
        System.out.println(result);
        result=a>b;//checking if a greater 10
        System.out.println(result);
	*/
    	Scanner in =new Scanner(System.in);//You can name teh scanner variable anything 
		System.out.println("Enter a number");
	    int n=in.nextInt();
		/*if(n<=100){
			System.out.println("The Number is less than or equal to 100");
		}
		else{
			System.out.println("The number is more than 100");
		}
		*/
		System.out.println("Enter the second number");
		int m=in.nextInt();
		/*if(m>n){
		
			System.out.println("The number " +m+ " is greater than "+n);
		}*/
		//Use else if when there are multiple if statements
		//otherwise the first if gets connected to the else statement
		//hence if the first if condition is not met the program will run the else
		
		/*else if(n>m){
			System.out.println("The number " +n+ " is greater than "+m);
			}
		
		else{
			System.out.println("The number "+m+" is equal to "+n);
			System.out.println("Therefore they are the same number");
		}*/
			
		System.out.println("Enter the third number");
		int o=in.nextInt();
		if(m>n){
			if(m>o){
				System.out.println("The largest of the 3 numbers is " +m);
			}
			else{
				System.out.println("The largest of the 3 numbers is " +o);
			}
					
			}
		else{
			if(n>o){
				System.out.println("The largest of the 3 numbers is " +n);
			}
			else{
				System.out.println("The largest of the 3 numbers is " +o);
			}
	}
}
	
	

}
