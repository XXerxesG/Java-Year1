
public class InsertSort {

	public static void main(String[] args) {
		int arr[]={4,5,3,9,7};
		int  swap[]= new int[arr.length];
		swap[0]=arr[0];
	for(int i=1;i<arr.length;i++)//loops runs for the length of the original array
	{ int key=arr[i];//holds the next value to be inserted
		for(int k=0;k<i;k++)//loop runs to check the values from the original array in the new array
		{
			if(key<swap[k]){//5>4,3<4
				//i=2,
				while(i<swap.length-1&&i>k){
				swap[i]=swap[i-1];
				i--;
				 }
				swap[k]=key;
				System.out.print(swap[k]);
				}
			else if(key>=swap[k]){//5>4
				swap[i]=key;//4,5
				
			}
			}
			
		}
	
	
		for(int i=0;i<swap.length;i++){
			
				System.out.println(swap[i]);
			
		}
	}

}