package balasantask;

interface Interface_1
{
	default void demo()
	{
		System.out.println("I am demo in Interface_1");
	}
}
interface Interface_2
{
	default void demo()
	{
		System.out.println("I am demo in Interface_2");
	}
}
public class DefaultInterface implements Interface_1,Interface_2{

	@Override
     public void demo() {
		
		Interface_1.super.demo();
		Interface_2.super.demo();
	}
	
	public static void main(String[] args) {
		
		DefaultInterface check=new DefaultInterface();
		check.demo();
	}

	
	
}
