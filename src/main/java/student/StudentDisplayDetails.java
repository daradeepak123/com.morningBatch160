package student;

public class StudentDisplayDetails {
	
	int id;
	String name;
	String gender;
	int age;
	int sal;
	String address;
	String pnNO;
	String dept;
	String company;
	static String instute="QUality THought";
	
	
	StudentDisplayDetails(int sid,String sname,String sgender,int sage, int ssal, String saddress, String spno, String sdept,String sCompany)
	{
		
		id=sid;
		name=sname;
		gender=sgender;
		age=sage;
		sal=ssal;
		address=saddress;
		pnNO=spno;
		dept=sdept;
		company=sCompany;
		
	}
	
	
	
	
	
	public void displayDetails()
	{
		System.out.println(name+" employee id is"+id);
		System.out.println("Student name is "+name);
		System.out.println(name+" gender is "+gender);
		System.out.println(name +"'s age is "+age);
		System.out.println(name+" salary is "+sal);
		System.out.println("Student address is "+address);
		System.out.println("Student phone number is "+pnNO);
		System.out.println("student department is  "+dept);
		System.out.println("Student works in "+company);
		System.out.println(instute);
		System.out.println("----------------------------");
	}
	
	

	public static void main(String[] args) {
		
		StudentDisplayDetails o=new StudentDisplayDetails(101,"Ram","male",25,100000,"Hyderanad","9999999999","testing","abc");
		o.displayDetails();
		
		
		StudentDisplayDetails o2=new StudentDisplayDetails(102,"Krish","male",21,100000,"Hyderabad","9999999998","testing","xyz");
		o2.displayDetails();
	
		

	}

}
