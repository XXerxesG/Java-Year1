
public class Person {
 public String name;
 public String lname;
 public boolean g;
 public Date dob;
 public Date(int day, int month,int year){
	 this.day=day;
	 this.month=month;
	 this.year=year;
 }
public Person(String name, String lname,String g, Date birth){
	this.name=name;
	this.lname=lname;
	if(g.charAt(0)=='M'||g.charAt(0)=='m'){
		{	this.g= true;
		}
	else{ 
			this.g=false;}
			
	}
}
	public static void main(String[] args) {
	 Date date= new Date(3,5,1997);
		Person a1=new Person("Johnny","Kay","Male");

	}

}
