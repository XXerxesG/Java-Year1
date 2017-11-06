package Vectors;
import java.util.*;
import java.util.Vector;

public class Test {
	public static void main(String [ ] args){
		Vector<Integer> v = readInVectorOfIntegers();
		for(int i=0;i<v.size();i++)
		{System.out.println(v.get(i));}
		//System.out.println("Largest int " + largest(v));
	}
	
	public static Vector <Integer> readInVectorOfIntegers(){
		Scanner in = new Scanner(System.in);
		Vector <Integer> w = new Vector<Integer>();
		System.out.println("Keep entering integer");
		System.out.println("Enter any char to exit");
		
		while(in.hasNextInt()) {	
	      w.addElement(in.nextInt());
		}
		return w;
	}

}
