
public class SelectSort {
  public static void main(String[] args) {
	int arr[]={3,2,7,6};
    int pos,p=0,tempvar=0;
	for(int i=0;i<arr.length;i++){
		pos=arr[i];//3
		for(int j=i+1;j<arr.length;j++){
			if(pos>arr[j]){//3>2
				pos=arr[j];//2,
				p=j;//1
			}
		}
		if(arr[i]>arr[p])
		{tempvar=arr[i];
		arr[i]=arr[p];
		arr[p]=tempvar;}
	}
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
 }
}   