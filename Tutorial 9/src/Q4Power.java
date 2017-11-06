/*import java.util.Scanner;

public class Q4Power {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 System.out.println("enter a number ");
		 int a=s.nextInt();
		 System.out.println("Enter the power");
		int b=s.nextInt();
		 int ans =power(a,b);
		 System.out.println(ans);
	}
	//3^2=3*3;4^3=4*4*4
	public static int power(int m,int n){
		if(n==0){
			return 1;
		}
		else{
			return m*power(m,n-1);
		}
	}

}*/
import java.util.Random;


public class Q4Power {

	static String[] answers = new String[] { "Without a doubt","Yes", "Concentrate and ask again", "Don't count on it",  "Very doubtful", "Outlook unclear" };

	public static void main(String[] args) {
		String c1 = censor("short");
		String c2 = censor("longer the short");
		String c3 = censor("the longest one we've got");

		print(c1);
		print(c2);
		print(c3);
		print("");

		for (int i = 0; i<20;i++){
			String m8ball1 = magic8Ball();
			print(m8ball1);
		}
		print("");

		String[] star1 = drawStars(10, 3);
		String[] star2 = drawStars(20, 10);
		String[] star3 = drawStars(30, 6);

		print(star1);
		print("");
		print(star2);
		print("");
		print(star3);
		print("");
	}





	private static void print(String c1) {
		System.out.println(c1);
		
	}





	private static String[] drawStars(int i, int j) {
		String sr[]= new String[j];
		for(int x=0;x<j;x++){
			sr[x]="";
			for(int y=0;y<i;y++){
				sr[x]+="*";
			}
		}
		return sr;
	}





	private static String magic8Ball() {
		String n="";
		Random r= new Random();
		int l= answers.length;
    	n=answers[r.nextInt(l)];
		return n;
	}
	




	private static void print(String[] star1) {
	
		for(int y=0;y<star1.length;y++){
			System.out.println(star1[y]);
		}
		
		
	}





	private static String censor(String sng) {
		String pr = "";
				
		for(int i=0;i<sng.length();i++){
			pr = pr +"*";
		}
		return pr;
	}
}