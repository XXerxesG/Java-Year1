import java.util.Scanner;
public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[];
		System.out.print("How big would you like your array?");
		int size=s.nextInt();
	    arr= new int[size];
        for(int i=0;i<size;i++){
        	System.out.print("Enter your "+(i+1)+ " no. : ");
        	arr[i]=s.nextInt();
        }int small;
        boolean t=true;//Descending
        while(t==true){
        	for(int i=1;i<size;i++){
        		t=false;
        			if(arr[i]>arr[i-1]){
        				small=arr[i-1];
        				arr[i-1]=arr[i];
        				arr[i]=small;
        	           t=true;
                               			
        			
        		}
        	}
        	for(int i=0; i<arr.length;i++){
        		System.out.println(arr[i]);
        	}
        }s.close();
	}

}
