
import java.util.Scanner;

public class ContactBook {
public Member[] members;        
public ContactBook(){
	members=new Member[200];
	loadmembers();
}
public void loadmembers(){
	Member m1=new Member("A111","Jay","979929",13,6,1993);
	Member m2=new Member("G232","Kate","7827429" ,1,4,1993);
    members[0]=m1;
    members[1]=m2;
}
	public void run() {
		int choice = getchoice();
		System.out.println(choice);
		while (choice != 0) {
			if (choice == 1) {
				displayAllmembers();
			}
			if (choice == 2) {
				addNewMember();
			} else if (choice == 3) {
				editAMember();
			} else
				{deleteAMember();}
			choice=getchoice();
		}
		System.out.println("Goodbye!");
	}

	public void displayAllmembers() {
		System.out.println("Displaying all members");
		int count=0;
		for(int i=0;i<members.length;i++){
			if(members[i]!=null){
				members[i].display();
				count++;
			}
			
		}
		System.out.println("The Number of Member are "+count);
	}

	public void addNewMember() {
		System.out.println("Add New Member");
		
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the Student Name:");
		String name= in.nextLine();
		System.out.println("Enter the Student ID: ");
		String sno=in.nextLine();
		System.out.println("Enter the Mobile Phone No. :");
		String pno=in.nextLine();
		System.out.println("Enter the Day of Birth: ");
		int day=in.nextInt();
		System.out.println("Enter the Month of Birth:");
		int month =in.nextInt();
		System.out.println("Enter the Year of Birth: ");
		int year =in.nextInt(); 
		
	}

	public void editAMember() {
		System.out.println();
		
	}

	public void deleteAMember() {
		System.out.println();
	}

	public static int getchoice() {
		int choice = 0;
		Scanner in = new Scanner(System.in);
		printMenu();
		System.out.println("Enter Choice: ");
		choice = in.nextInt();
		return choice;
	}

	public static void printMenu() {
		System.out.println("1.	Display All Members");
		System.out.println("2.	Add New Member");
		System.out.println("3.	Edit An Existing Member");
		System.out.println("4.	Delete An Existing Member");
		System.out.println("0.  Exit.");
	}

	public static void main(String[] args) {
		ContactBook app = new ContactBook();
		app.run();

	}

}
