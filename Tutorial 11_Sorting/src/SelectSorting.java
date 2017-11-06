
public class SelectSorting {

	public static void main(String[] args) {
		int arr[]={4,3,9,7};
		int tempvar,p=0;
		for(int i=0;i<arr.length;i++){
			int num=arr[i];
			  for(int j=i+1;j<arr.length;j++){
				  if(num>arr[j]){
					  num=arr[j];
					  p=j;
				  }
			  }
			  tempvar=arr[i];
			  arr[i]=arr[p];
			  arr[p]=tempvar;
		}
		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
