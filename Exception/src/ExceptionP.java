
public class ExceptionP {

	public static void main(String[] args) {
		ExceptionP exceptionPropagationDemo=new ExceptionP();
		try
		{
			exceptionPropagationDemo.method1();
			
		}
catch(Exception exe)
		{
	exe.printStackTrace();
	System.out.println("exception is handled in main method");
		}
	}
	public void method1()
	{
		System.out.println("method1() is called");
		method2();
	}
	public void method2()
	{
		System.out.println("method2() is called");
		method3();
	}
	public void method3()
	{
		System.out.println("method3() is called");
		String str="null";
		System.out.println(str.length());
	}

	
}
