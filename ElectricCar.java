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
