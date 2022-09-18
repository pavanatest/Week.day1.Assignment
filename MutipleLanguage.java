package language;

public abstract class MutipleLanguage implements TestTool {
	
	public void python()
	{
		System.out.println("abstract class-python");
	}
	public void java()
	{
		System.out.println("interface method- java");
		
	}
	public void selenium()
	{
		System.out.println("interface testtol- selenium method");
	}
	abstract void ruby();

}
