package java0;
import java0.Utils;

public class InterfaceTest implements ISayable {

	@Override
	public void callMe() {
		// TODO Auto-generated method stub
		Utils.print("callMe Implementation");
	}

	@Override
	public void absCallMe() {
		// TODO Auto-generated method stub
		
		Utils.print("absCallMe Implementation");

	}
	
	@Override
	public void sayName(String s) {
		// TODO Auto-generated method stub
		Utils.print("My Name is "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest it=new InterfaceTest();
		it.callMe();
		it.absCallMe();
		it.sayName("Ismail");
		Utils.print("No of Developer : "+noOfDeveloper);

	}

}
