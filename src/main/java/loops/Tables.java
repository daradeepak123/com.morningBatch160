package loops;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter desired number");
		int num=sc.nextInt();
		System.out.println("enter max table number");
		int max=sc.nextInt();
		for(int i=1;i<=max;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}
		
		

	}

}
