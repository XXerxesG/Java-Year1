import java.util.*;
import java.io.*;
public class WriteToFile1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos= new FileOutputStream("New.txt");
		PrintStream ps=new PrintStream(fos);
		ps.print("This is ");
		ps.println("a new file");
		ps.print("Written in Eclipse");
     FileReader fr=new FileReader("New.txt");
     BufferedReader b=new BufferedReader(fr);
     int t=b.read();
     while(t!=-1){
    	 System.out.print((char)t);
    	 t=b.read();
     }
	}

}
