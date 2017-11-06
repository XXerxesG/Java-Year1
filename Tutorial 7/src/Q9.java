import java.util.Scanner;
public class Q9 {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter 10 numbers :");
	  int tennum[]=new int[10];
	  int evenSum=0,oddSum=0;
	  for(int i=0;i<10;i++){
		  System.out.println("Enter Number 1 :");
		 tennum[i]=s.nextInt();
	       if(tennum[i] % 2==0){
	    	   evenSum+=tennum[i];
	       }
	       else
	    	   oddSum+=tennum[i];
	  }
	  if(evenSum>oddSum)
		  System.out.println("Sum of Even is larger than Sum of Odd");
	  if(oddSum==evenSum)
		  System.out.println("	Sum of Even is equal to Sum of Odd");
	  else
		  System.out.println("Sum of Odd is greater than sum of Even");
	}

}
