
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={3,2,7,6};
	    int pos,p=0,tempvar=0;
		for(int i=0;i<arr.length;i++){
			pos=arr[i];
			for(int j=1;j<arr.length;i++){
				if(pos>arr[j]){
					tempvar=arr[j];
					p=j;
					
				}
			}arr[i]=arr[p];
			arr[p]=tempvar;
		}
for(int i=0;i<arr.length;i++){
	System.out.println(arr[i]);
}
	}

}
