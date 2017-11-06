
public class Selection_Sort {
 public static void main(String[] args) {
   int arr[]={3,2,7,1};
   int min=arr[0],pos=0,temp=0;
   //System.out.println("Number "+min+" Pos "+pos);
   for(int i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]);
   }System.out.println("");
       int p1=  find(arr);//p1 is the smallest pos
       System.out.println(p1);
       boolean b=true; int big=1;
  while(b!=false){  
	  b=false;
    for(int i=0;i<arr.length;i++){
    	 if(p1>i){
    		 temp=arr[i];
    		 arr[i]=arr[p1];
    		 arr[p1]=temp;
    	 } 
    	 else{
    		 b=false;
    	 }		
     }
   p1=sort(arr,big);
   b=false;
 } 
     for(int i=0;i<arr.length;i++){
    	 System.out.print(arr[i]);
     }
}
	
 public static int find(int[] num){
     int small=num[0],pos=0;	
	 for(int i=1;i<num.length;i++){
     	    if(num[i]<small){
     	    	
     	    	pos=i;
     	    }
     	}
return pos;
  }
 public static int sort(int[]num,int BIG){
	int inc=0;
  	for(int i=BIG+1;i<num.length;i++){
  		if(num[BIG]<num[i]){
  			inc=i;
  		}
  	}
	
 
	 return inc;
 }
}