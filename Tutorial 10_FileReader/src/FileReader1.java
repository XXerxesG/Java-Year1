import java.util.*;
import java.io.*;
public class FileReader1 {

	public static void main(String[] args) throws IOException {
		FileReader fr= new FileReader("littleprincech1.txt");
		Scanner s= new Scanner(fr);
		while(s.hasNextLine()){
			System.out.println(s.nextLine());
			
		}
		s.close();
	}

}
