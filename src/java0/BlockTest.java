package java0;

public class BlockTest extends ExtendedBlock {

	// first block
	{
		Utils.print("BlockTest class first block");
	}

	// Second block
	{
		Utils.print("BlockTest class second block");
	}
	// static block
	static {
		Utils.print("BlockTest class static block");
	}

	public BlockTest() {
		Utils.print("BlockTest constractor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new BlockTest();

	}

}
