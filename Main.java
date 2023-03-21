package Week1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Car yourCar = new Car("Toyota", "Raize", 2024);

		String yourMaker = yourCar.getMaker();
		String yourModel = yourCar.getModel();
		int yourYear = yourCar.getYear();
		
		System.out.println(yourMaker);
		System.out.println(yourModel);
		System.out.println(yourYear);
		System.out.println("");
		
		yourCar.ignition(false);
		yourCar.start();
		yourCar.ignition(true);
		yourCar.start();
		yourCar.ignition(true);
		yourCar.stop();
		yourCar.ignition(false);
		yourCar.stop();
		
		System.out.println("");
		
		Car myCar = new Car(null,null,0);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter maker: ");
		String myMaker = scan.nextLine();
		System.out.print("Enter model: ");
		String myModel = scan.nextLine();
		System.out.print("Enter year: ");
		int myYear = scan.nextInt();
		
		System.out.println("");
		System.out.println("Maker: " + myMaker);
		System.out.println("Model: " + myModel);
		System.out.println("Year: " + myYear);
		System.out.println("");
		
		System.out.println("Electric Cars");
		ElectricCar eCar = new ElectricCar("Tesla", "Model s", 2023, 0);
		String maker = eCar.getMaker();
		String model = eCar.getModel();
		int year = eCar.getYear();
		
		System.out.println("");
		System.out.println("Maker: " + maker);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
		System.out.println("");
		
		//User input battery level
		System.out.print("Enter Battery:");
	    eCar.setBattery(scan.nextInt());
	    int battery = eCar.getBattery();
	  
	    
		System.out.println("Battery: " + battery + "%");
		System.out.println("");
		
		eCar.start();
		
	}

}
