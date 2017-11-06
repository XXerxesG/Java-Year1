import java.util.Scanner;
class Q5and6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String pname[];
        pname=new String[10];
        System.out.println(" Enter the name of the 4 players");
        for(int i=1;i<=4;i++){
        	pname[i]=s.nextLine();
        	
        }
        for(int i=1;i<=4;i++){
        	System.out.println("Hello "+pname[i]);
        }
	}

}
