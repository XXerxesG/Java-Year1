import java.util.*;
import java.io.*;
public class CopyToFile {

	public static void main(String[] args)throws IOException {
		FileReader fr= new FileReader("newfile.txt");
		FileOutputStream fos=new FileOutputStream("newfile2.txt");
		PrintWriter out=new PrintWriter(fos);
		int t=fr.read();
		while(t!=-1){
			out.print((char)t);
			t=fr.read();
			
		}

	}

}
