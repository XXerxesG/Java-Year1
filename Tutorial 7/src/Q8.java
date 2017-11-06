import java.util.Scanner;
public class Q8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many number would you like to Enter??");
		int n=s.nextInt();
		int k[];
		k=new int[n];
		System.out.println("Enter your numbers");
		for(int i=0;i<k.length;i++){
			k[i]=s.nextInt();
		}
        for(int j=k.length-1;j>=0;j--){
        System.out.print(+k[j]);
        }
        System.out.println(" ");
        for(int j=k.length-1;j>=0;j--){
            System.out.print(+k[j]);
             if(j==0)
             {System.out.println(" ");
            	 for(int i=0;i<k.length;i++){
         		System.out.print(k[i]);
         		}
             }
        }
	   
	}

}
