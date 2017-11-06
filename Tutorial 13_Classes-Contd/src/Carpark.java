
public class Carpark {

	public static void main(String[] args) {
		Car blueCar = new Car("A111", "Blue", 4);
		Car yellowCar = new Car("B111", "Yellow", 4);
		Car greenCar = new Car("C111", "Green", 4);
		// Car pinkCar=new Car("E111","Piink",1);
		Car blackCar = new Car("F111", "Black", 2);

		Car[] carpark = new Car[5];
		carpark[0] = yellowCar;
		carpark[1] = greenCar;
		//carpark[2] = pinkCar;
		carpark[3] = blueCar;
		carpark[4] = blackCar;
		for (int i = 0; i < carpark.length; i++) {
			if (carpark[i] != null) {
				// To Avoid the NullPointer exception
				carpark[i].Display();
			}
		}
		System.out.println("");
		for (int i = 0; i < carpark.length; i++) {
			if (carpark[i] != null) {
				// Searching for car with yellow colour
				if (carpark[i].colour == "Yellow")
					carpark[i].Display();
			}
		}
		Car redSportsCar = new Car("D111", "Red", 2);
		System.out.println("");
		boolean parked = false;
		for (int i = 0; i < carpark.length; i++) {
			if (carpark[i] == null) {
				carpark[i] = redSportsCar;
				parked = true;
				break;
			}
		}
		if (parked) {
			System.out.println("The Car is parked");
		} else
			System.out.println("The car is not parked");

		System.out.println("To check if the red car is in the carpark");
		for (int i = 0; i < carpark.length; i++) {
			if (carpark[i] != null) {
				// To Avoid the NullPointer exception
				carpark[i].Display();
				System.out.println();
			}
		}
		// To delete a car
		System.out.println("We will delete the red car");
		for(int i=0;i<carpark.length;i++){
			if(carpark[i].regno=="D111"){
				carpark[i]=null;
				break;
			}
		}
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<carpark.length;i++){
			if(carpark[i]!=null){
				carpark[i].Display();
				
			}
		}
	}
}
