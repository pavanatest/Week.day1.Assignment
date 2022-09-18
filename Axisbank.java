package bank;

public class Axisbank extends BankInfo{
	
	//assignment3
	
	public double deposit()
	{
		System.out.println("deposit method- IR is ");
		return 7.95;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Axisbank axb=new Axisbank();
		axb.saving();
		axb.fixed();
		System.out.println(axb.deposit());
	}

}
