package java0;

public class UseAnimals {
	
	public void doStaff(Animal a){
		System.out.println("In the Animal version");
	}
	
	public void doStaff(Horse h){
		System.out.println("In the Hourse version");
	}
	
	public static void main(String arg[]){
		
		UseAnimals ua=new UseAnimals();
		
		Animal a=new Horse();
		
		ua.doStaff(a);
		
		a.eat();
		
	}

}
