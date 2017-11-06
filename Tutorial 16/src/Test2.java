import java.util.*;
import java.io.*;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner (System.in);
		System.out.println("Enter a number");
		String in = s.nextLine();
		try{
			int num = Integer.parseInt(in);
		}catch(NumberFormatException ex){
			System.out.println("Eneter an Integer pls");
		}
				

	}

}