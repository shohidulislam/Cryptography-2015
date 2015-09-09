package java0;

public class Java0 {

	public Java0() {
		System.out.println("----------I am from Java0----------");
		testJava0();
	}

	public static void testJava0() {
		System.out.println("Test Result From Java0.");
		System.out.println("-----------------------.");
		
		Vehicle v = new Vehicle("Track");
		Car c = new Car("car", "sports");

		c.showDetail();
		c.vehicleType = "Track";
		c.modelType = "transport";
		c.showDetail();

		// c=v; //not allowed
		v = c; // but this is allowed

		// v.modelType="race"; //not allowed
		v.vehicleType = "Cycle"; // but this allowed

		v.showDetail();

		// inherited from Object class
		v.toString();
		
		//Figure f=new Figure(); //not allowed abstract class
		Triangle t=new Triangle(10,20);
		double area=t.area();
		System.out.println("area of the triangle "+area);
	

		System.out.println("-----------------------.");
	}

}
