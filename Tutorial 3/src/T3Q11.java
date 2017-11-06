
import java.util.Scanner;
public class T3Q11 {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Enter your Mark for JAVA Exam");
        int j=m.nextInt();
        boolean b=j<=100&&j>=0;
        if(b==false){
        	System.out.println("invalid");
        }
        else{
        	System.out.println("Enter your Coursework marks");
        	int k=m.nextInt();
        	boolean g=k>=0&&k<=100;
        	if(g==false)
        	System.out.println("Invalid ");
        	else{
        	float avg=(j+k)/2;
        	System.out.println("Your avgerage for java is "+avg);
        	}
        }
	}

}
