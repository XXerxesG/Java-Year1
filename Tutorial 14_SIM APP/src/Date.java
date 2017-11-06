
public class Date {
 public int day;
 public int month;
 public int year;
public Date(int day, int month ,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
	
}
 public String toString(){
	 return day+"/"+month+"/"+year;
 }
}
