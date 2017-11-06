
public class RecursionForRangeOfNumbers {

		public static void main(String [] inputs)
		{
			printNumRange(12,15);
		}
// You are basically calling a COPY of the same function
		public static void printNumRange(int start,int end)
		{
			if(start!=end+1) //end point
			{
				System.out.println(start);
				printNumRange(start+1,end);
			}
			System.out.println("This code is goin back now");
		} 

	}


