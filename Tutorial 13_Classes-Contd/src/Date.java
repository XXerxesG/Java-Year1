
public class Date {
 int day;
 int month;
 int year;

	public Date(int day, int month,int year){
	 this.day=day;
	 this.month=month;
	 this.year=year;
 }
	public static void main(String[] args) {
	 Date date1 = new Date(2,12,1998);
	//System.out.println(" day "+date1.day+" month "+date1.month+" year "+date1.year);
	date1.day=12;
	date1.month=11;
	date1.year=1995;
	System.out.println(" day "+date1.day+" month "+date1.month+" year "+date1.year);
	
	}
}
