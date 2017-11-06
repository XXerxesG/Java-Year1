public class Member{
	public String sID;
	public String name;
	public String pno;
	public Date dob;
	public Member(String sID, String name, String pno, Date dob){
		this.sID=sID;
		this.name=name;
		this.pno=pno;
		this.dob=dob;
	}
	public Member(String sID, String name, String pno, int day,int month ,int year){
		this.sID=sID;
		this.name=name;
		this.pno=pno;
		this.dob=new Date(day,month,year);
	}
public void	display(){
		System.out.println("Student ID: "+sID);
		System.out.println("Name: "+name);
		System.out.println(" Mobile Phone Number: "+pno);
		System.out.println("Date of Birth: "+dob);
		
	}
public static void main(String[] args){
	 Member m = new Member("12345","Joe","9876642",12,1,1994);
	 m.display();
}
}