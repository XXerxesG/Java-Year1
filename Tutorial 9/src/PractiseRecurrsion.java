
public class PractiseRecurrsion {
 public static void main(String[] args){
	 printtothree(1);
 }
 public static void printtothree(int n){ 
	 // just another way of looping , the class printothree runs 3
	 //times and then goes back three time back to main
	 if(n!=4){
		 System.out.println(n);
		 printtothree(n+1);
	 }
 }
}
