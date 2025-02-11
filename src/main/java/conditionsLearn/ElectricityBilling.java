package conditionsLearn;

import java.util.Scanner;

public class ElectricityBilling {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter last month reading");
		int lMonth=sc.nextInt();
		System.out.println("enter current month reading");
		int cMonth=sc.nextInt();

		int units=cMonth-lMonth;
		if(units<99 && units<100)
		{
			System.out.println("hello"+name+", you need to pay "+units*2);
		}
		else if(units>=100 && units<199)
		{
			System.out.println("hello"+name+", you need to pay "+units*3);
		}
		else if(units>=200 && units<299)
		{
			System.out.println("hello"+name+", you need to pay "+units*4);
		}
		
		else if(units>=300 && units<399)
		{
			System.out.println("hello"+name+", you need to pay "+units*5);
		}

		else if(units>=400 && units<499)
		{
			System.out.println("hello"+name+", you need to pay "+units*6);
		}
		else if(units>=500)
		{
			System.out.println("hello"+name+", you need to pay "+units*10);
		}
		
	}

}
