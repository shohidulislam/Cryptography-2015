package java0;

public class ExtendedBlock extends Block {

	// first block
	{
		Utils.print("ExtendedBlock class first block");
	}

	// Contractor
	public ExtendedBlock() {
		Utils.print("ExtendedBlock class constractor");
	}

	// Second block
	{
		Utils.print("ExtendedBlock class second block");
	}
	// static block
	static {
		Utils.print("ExtendedBlock class static block");
	}

}
