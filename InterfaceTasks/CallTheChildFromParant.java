package balasantask;

interface Parent
{
	void println();
	default void print()
	{
		println();
	}

}

class Child implements Parent
{
	@Override
	public void println()
	{
		System.out.println("Reached here");
	}
}

public class CallTheChildFromParant {

	public static void main(String[] args) {
		
        Parent callParent=new Child();
        callParent.print();
         
	}

}
