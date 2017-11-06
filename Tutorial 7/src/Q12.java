import java.util.Scanner;
public class Q12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many Strings would you like to enter");
		int n=s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter your string :");
			arr[i]=s.next();
		}
		String largest="";
		for(int i=0;i<n;i++){
			if(largest.length()<=arr[i].length()){
				largest=arr[i];
			}
		}
		System.out.println("Ther largest String is : "+largest);
	}

}
