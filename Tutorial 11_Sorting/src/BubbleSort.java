
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={3,4,7,5};
		int tempvar;
		boolean swap=true;
		while(swap){
			swap=false;
			for(int i=1;i<arr.length;i++){
				if(arr[i]<arr[i-1]){
					tempvar=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=tempvar;
					swap=true;
					}
			}
		     
	}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

}
