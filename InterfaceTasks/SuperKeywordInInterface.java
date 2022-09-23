package balasantask;

interface InterfaceDemo
{
	
	public default void reach()
	{
		System.out.println("Meet the  parent");
	}
	public static void staticMethod()
	{
		System.out.println("I am Static from super");
	}
}

public class SuperKeywordInInterface  implements InterfaceDemo{

	public void superCheck()
	{
		InterfaceDemo.super.reach();
		InterfaceDemo.staticMethod();
	}
	public static void main(String[] args) {
		
		InterfaceDemo.staticMethod();
		SuperKeywordInInterface  obj=new SuperKeywordInInterface();
		//obj.Static(); 
		
		obj.superCheck();

	}

}
