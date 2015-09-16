package java0;

public interface ICallable {
	//interface constant like variable
	int noOfDeveloper=4;
	//private void callMe(); // private is not allowed
	public void callMe();
	
	//static method
	public static void testMe(){
		System.out.println("Test Me from ICallable Interface");
	}
	
	//abstract method
	public abstract void absCallMe();
	
	//default method 
	default void defCallMe(){
		System.out.println("A default method in ICallable Interface");
	}

}
