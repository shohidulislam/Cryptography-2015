package java0;

public class Vehicle {

	String vehicleType;

	public Vehicle(String vehicleType) {
		this.vehicleType = vehicleType;

		System.out.println("Creating Vehicle");
	}

	public void showDetail() {
		System.out.println("Vehicle Type: " + vehicleType);
	}

}
