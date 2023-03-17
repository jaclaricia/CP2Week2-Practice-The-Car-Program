# Computer-Programming-2
MO-IT103-S1102

//MAIN

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

//CLASS: Car

package Week1;

public class Car {
	private String maker;
	private String model;
	private int year;
	private boolean isRunning;

	public Car(String maker, String model, int year) {
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.isRunning = false;
	}
	
	
	public void start() {
		if(isRunning) {
			System.out.println("The car is already running.");
		}else {
			System.out.println("Starting the car.");
			isRunning = true;
		}
	}
	
	public void stop() {
		if(isRunning) {
			System.out.println("Stopping the car.");
			isRunning = false;
		}else {
			System.out.println("The car already stopped.");
		}
	}
	
	//Setter
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void ignition(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	//Getter
	String getMaker() {
		return maker;
	}
	
	String getModel() {
		return model;
	}
	
	int getYear() {
		return year;
	}
}

//CLASS: ElectricCar

package Week1;

public class ElectricCar extends Car{
	private int batteryLevel = 0;
	
	public ElectricCar(String maker, String model, int year, int batteryLevel) {
		super(maker, model, year);
		this.batteryLevel = batteryLevel;
	}
	
	public void start() {
		if(batteryLevel == 0) {
			System.out.println("Empty Battery");
			super.ignition(false);
			super.stop();
		}else if(batteryLevel < 20) {
			System.out.println("The battery is too low to start the car.");
		}else if(batteryLevel >= 20 && batteryLevel <=30) {
			System.out.println("Please charge to the nearest charging station");
			super.start();
		}else if(batteryLevel > 30 && batteryLevel<100) {
			super.start();
		}else if(batteryLevel == 100) {
			System.out.println("Fully Charged!");
			super.start();
		}else System.out.println("Invalid Battery.");			
	}
	
	//Setter
	public void setBattery(int batteryLevel) {
		this.batteryLevel = batteryLevel;
	}
	
	//Getter
	int getBattery() {
		return batteryLevel;
	}
}
