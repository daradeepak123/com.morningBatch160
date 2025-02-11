package loops;

import java.util.Scanner;

public class LoopWithBreak {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int loopSize=30;
		System.out.println("Enter desired number less than "+loopSize);
		int num=sc.nextInt();
		
		for(int i=1;i<=loopSize;i++)
		{
		
			if(num<=i)
			{
				continue;
			}
			System.out.println(i);
		}
		

	}

}
