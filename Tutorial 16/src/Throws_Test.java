/*import java.io.*;
import java.util.*;
public class Throws_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc= new Scanner(new File("test.txt"));
		}catch(FileNotFoundException ex){
			System.out.println("File Not Found");
		}
		
	}

}*/

import java.io.*;
import java.util.*;
public class Throws_Test {

	public static void main(String[] args) throws FileNotFoundException {
		readfile();
		
	}
	

 public static void readfile()throws FileNotFoundException{
	try{
		Scanner sc= new Scanner(new File("test.txt"));
	}catch(FileNotFoundException ex){
		System.out.println("File Not Found");
	}
	
 }
}
