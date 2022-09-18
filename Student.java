package org.student;

import org.department.Department;

public class Student extends Department  {

	
		public String Name="harry";
				public String Dept="CSE";
				public int sid= 200201;
				
				public void studentName()
				{
					System.out.println("name"+Name);
				}
				
				public void studentDept()
				{
					System.out.println("department" +Dept);
				}
				public void studentId()
				{
					System.out.println("ID"+sid);
				}
				
	



public static void main(String[] args) {
	// TODO Auto-generated method stub
	Student y = new Student();
	
	y.collegeCode();
	y.collegeName();
	y.collegeRank();
	y.deptName();
	y.studentName();
	y.studentId();
	y.studentDept();
	
	

	

}
}
