package conditionsLearn;

import java.util.Scanner;

public class WeeksPrint {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter desired number bet 1-7");
		int num=sc.nextInt();
		
		if(num==1)
		{
			System.out.println("this is monday");
		}
		else if(num==2)
		{
			System.out.println("this is tuesday");
		}
		else if(num==3)
		{
			System.out.println("this is webnesday");
		}
		else if(num==4)
		{
			System.out.println("This is thurs");
		}
		else if(num==5)
		{
			System.out.println("This is friday");
		}
		
		else if(num==6)
		{
			System.out.println("This is saturday");
		}
		else if(num==7)
		{
			System.out.println("This is Sunday");
		}
		else
		{
			System.out.println("please enter numbers between 1-7");
		}

	}

}
