package java0;

public class Block {
	
	//first block
	{
		Utils.print("Block class first block");
	}
	
	public Block(){
		Utils.print("Block class constractor");
	}
	
	//static block
	static {
		Utils.print("Block class static block");
	}
	
	//Second block
	{
		Utils.print("Block class second block");
	}

}
