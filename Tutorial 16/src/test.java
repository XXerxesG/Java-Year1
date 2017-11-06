import java.io.*;
import java.util.*;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] num={1,2,3,4};
try{
	for (int i=0;i<=4;i++)
	{
	 System.out.println(num[i]);
 }
}catch(ArrayIndexOutOfBoundsException ex){
	System.out.println("Array is out of bound");
}
 Scanner s = new Scanner(System.in);
  System.out.println("Enter a Number");
  try{int k=s.nextInt();
  }catch(InputMismatchException ex){
	  System.out.println("Enter an integer value please.");
  }
 
	}

}
