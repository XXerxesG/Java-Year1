import java.io.*;
import java.util.*;
public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= new String[5];
		names[0]= "Leo";
		names[1]= "KAsey";
		names[3]= "Jimm";
		names[4]= "Mat";
		//names[5]= ;
		for(int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		/*for(int i=0;i<names.length;i++){
			if(names[i]!=null){
				System.out.println(names[i].length());
			}
		
		}*/
		for(int i=0;i<names.length;i++){
			try{
				System.out.println(names[i].length());
			}catch(NullPointerException ex){
				System.out.println("Null Pointer");
			}
		}
		
	}

}
