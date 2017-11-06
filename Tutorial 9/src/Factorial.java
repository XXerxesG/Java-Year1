
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int ans=fact(4);
        System.out.println("This is the Factorial "+ans);
	}
	/* Fatorial of 4
	 * 4,3,2,1
	 * 4*3*2*1;
	 */
public static int fact(int n){
	if(n==0){
		return 1;
}
	else
		
	  return n*fact(n-1);
  }
}
