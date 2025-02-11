package loops;

import java.util.Random;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int i=1;
		int num=0;
		do
		{
			num=rand.nextInt(100);
			
			if(num%2==0)
			{
				System.out.println(num+" is a even number");
			}
			else
			{
				System.out.println(num+" is a odd number");
			}
			
			i++;
		}while(i<=10);

	}

}
