package language;

public class Automation extends MutipleLanguage  {
	public void ruby()
	{ 
		System.out.println(" from abstract class- ruby method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Automation aut=new Automation();
		aut.java();
		aut.selenium();
		aut.python();
		aut.ruby();

	}

}
