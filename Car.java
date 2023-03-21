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
