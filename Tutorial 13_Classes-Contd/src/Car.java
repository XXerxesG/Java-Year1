
public class Car {
 public String regno;
 public String colour;
 public int noDoors;
	public Car(String regno, String colour,int noDoors) {
	 this.regno=regno;
	 this.colour=colour;
	 this.noDoors=noDoors;
	 
	
}
	public void Display(){
		System.out.println("Reg no"+regno);
		System.out.println("Colour :"+colour);
		System.out.println("no. of Doors"+noDoors);
	}
	public static void main(String[] args) {
		Car myCar = new Car("X1212","Blue",3);
		myCar.Display();
	}

}
