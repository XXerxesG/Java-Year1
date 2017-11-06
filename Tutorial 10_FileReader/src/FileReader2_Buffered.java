import java.io.*;

public class FileReader2_Buffered {

	public static void main(String[] args) throws IOException {
	FileReader fr = new FileReader("newfile.txt");
	BufferedReader r=new BufferedReader(fr);
	// To read char by char
	/*int text=r.read();
	while(text!=-1){
		System.out.print((char)text);
		text=r.read();
	   }*/
	// Alternate way to read line by line
	String l="";
	while((l=r.readLine())!=null){
		System.out.println(l);
	 }
	}

}
