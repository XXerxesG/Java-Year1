
public class Fibonacci {
	public static void main(String [] inputs)
	{
		int answer = fiboNumber(7);
		System.out.println(answer);
	}
	
	public static int fiboNumber(int n)
	{
	        if (n <= 1) 
	        {
		return n;
	        }
	        else 
	        {
		 return fiboNumber(n-1) + fiboNumber(n-2);
	        }
	} 

}
