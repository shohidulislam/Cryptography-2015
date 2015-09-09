package java0;

public class Car extends Vehicle {

	String modelType;

	public Car(String vehicleType, String modelType) {
		super(vehicleType);
		this.modelType = modelType;
		// super.vehicleType=vehicleType;

		System.out.println("Creating Car");
	}

	public void showDetail() {
		System.out.println("Car Model: " + modelType + " Vehicle Type: "
				+ vehicleType);
	}

}
