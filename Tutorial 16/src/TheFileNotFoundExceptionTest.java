import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheFileNotFoundExceptionTest {
	public static void main(String[] args){
		
		try{
			Scanner sc= new Scanner (new File("marks.txt"));
			System.out.println("Fiile is found");
		}catch(FileNotFoundException ex){
			System.out.println("File not Fouund");
		}
	}
}
