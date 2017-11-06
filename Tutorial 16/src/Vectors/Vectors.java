package Vectors;
import java.util.*;
public class Vectors {
 public static void main(String[] args){
	 Vector<String> stringVector = new Vector <String>();
	 stringVector.addElement("A");
	 stringVector.add("B");
	 stringVector.addElement("C");
	 System.out.println(stringVector.size());
	 System.out.println(stringVector.get(0));
	 System.out.println(stringVector.elementAt(2));
	 
	 System.out.println(stringVector.remove(0));
	 System.out.println("After remove");
	 System.out.println(stringVector.size());
	 System.out.println(stringVector.get(0));
	 
	 stringVector.setElementAt("Java", 0);
	 System.out.println("After Set element at 0");
	 System.out.println(stringVector.get(0));
	 
	 stringVector.add("World");//stringVector.add(1,"World");
	 System.out.println("Using loops with vectors");
	 for(int i=0; i<stringVector.size();i++){
		 System.out.println(stringVector.get(i));
	 }
	 
	 
 }
}
