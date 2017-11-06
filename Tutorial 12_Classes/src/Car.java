
public class Car {
	public String licensno;
	public String color;
	public int ts;
	// Constructor is a method with the same name as the Class
	// Use this. if the variables it accepts are same .
	public Car(String l, String c, int t){
		
		licensno=l;
		color=c;
		ts=t;
	}
	public static void main(String[] args) {
	
	 
	 Car bmw=new Car("S56422","Grey",150);
	 Car audi =new Car("R16778","White",130);
	
	/* bmw.licensno="S98645";
	 bmw.color="Red";
	 bmw.ts=100;
	
	 audi.licensno="s5789546";
	 audi.color="Yellow";
	 audi.ts=120;
	 */
	 bmw.acc();
	 bmw.display();
	 bmw.hor();
	 System.out.println("");
	 audi.display();
	 Car mercedes= new Car("S98759","Blue",110);
	 System.out.println("");
	 mercedes.display();
	}
	public void  display(){
		System.out.println("Car No. "+licensno);
		System.out.println("Color "+color);
		System.out.println("Speed "+ts);
		
	}
	public void acc(){
		ts=ts+50;
	}
	public void hor(){
		System.out.println("noise noise");
	}

}
