package student;

import encapsulationLearn.encapsuleDAta;

public class StudentLearn {
	
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
	
	

	public static void main(String[] args) {
		
		StudentLearn o=new StudentLearn();
		o.id=101;
		o.name="Ram";
		o.gender="Male";
		o.age=25;
		o.sal=100000;
		o.address="Hyderabad";
		o.pnNO="9999999999";
		o.dept="testing";
		o.company="abc";
		System.out.println(o.id);
		System.out.println(o.name);
		System.out.println(o.gender);
		System.out.println(o.age);
		System.out.println(o.sal);
		System.out.println(o.address);
		System.out.println(o.pnNO);
		System.out.println(o.dept);
		System.out.println(o.company);
		System.out.println(instute);
		System.out.println("----------------------------");
	
		
		
		
		
		StudentLearn o2=new StudentLearn();
		o2.id=102;
		o2.name="Krish";
		o2.gender="Male";
		o2.age=22;
		o2.sal=150000;
		o2.address="Hyderabad";
		o2.pnNO="9999999998";
		o2.dept="testing";
		o2.company="xyz";
		System.out.println(o2.id);
		System.out.println(o2.name);
		System.out.println(o2.gender);
		System.out.println(o2.age);
		System.out.println(o2.sal);
		System.out.println(o2.address);
		System.out.println(o2.pnNO);
		System.out.println(o2.dept);
		System.out.println(o2.company);
		System.out.println(instute);
		System.out.println("----------------------------");
	
		encapsuleDAta e=new encapsuleDAta();
		
		e.travel();

	}

}
