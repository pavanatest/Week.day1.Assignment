package student;



public class Students {
	
	public void getStudentInfo(int id)

	{
		System.out.println("student id"+id);
	}
	public void getStudentInfo( int id,String name)
	{
		System.out.println("student id "+id);
		System.out.println("nameis "+name);
		
	}
	public void getStudentInfo(String  mail,String phone)
	{
		System.out.println("mail"+mail);
		System.out.println("phone"+phone);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Students  sss= new Students();
		sss.getStudentInfo(100703);
		sss.getStudentInfo(379011,"Nisha");
		sss.getStudentInfo("happy123@gmail.com", "987654321");
		

	}

}
