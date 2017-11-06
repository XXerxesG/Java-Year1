import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many Number would you like to Enter  ?");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter your Number ");
			arr[i]=s.nextInt();
		}
		System.out.println("Enter a Number to check its occurence");
		int oc=s.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
			if(arr[i]==oc)
			{
				c++;
			}
		}
		System.out.println("The Number "+oc+" occured "+c+" times");
	}

}
