import java.util.*;

	public class Keyboard {

	
	  public static String readString(String prompt) {
	    System.out.print(prompt);
	    return new Scanner(System.in).nextLine();
	  }

	public static double readDouble(String prompt) {
		double input =0;
		boolean valid=false;
		while(!valid){
			try{
				String data = readString(prompt);
				input = Double.parseDouble(data);
				valid=true;
			}catch(NumberFormatException ex){
				System.out.println("Eneter a double value");
			}
		}
		return input;
	}

	public static int readInt(String prompt) {
	int input =0;
		boolean valid=false;
		while(!valid){
			try{
				String data = readString(prompt);
				input = Integer.parseInt(data);
				valid=true;
			}catch(NumberFormatException ex){
				System.out.println("Eneter a integer value");
			}
		}
		return input;
	}
}

