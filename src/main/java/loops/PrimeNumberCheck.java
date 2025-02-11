package loops;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter desired number to check prime or not");
		int num=sc.nextInt();
		boolean b=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				b=false;
			}
		}
		
		
		if(!b)
		{
			System.out.println(num+" is not a prime number");
		}
		else
		{
			System.out.println(num+" is a prime number");
		}
		
		
	}

}
