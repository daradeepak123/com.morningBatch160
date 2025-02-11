package arraysLearn;

import java.util.Random;

public class AddNumbersInArray {

	public static void main(String[] args) {
		
		Random rand=new Random();
		int a[]=new int[1000];
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=rand.nextInt(2000);
			
		}
		int e=0;
		int o=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				e++;
			}
			else
			{
				o++;
			}			
		}
		
		System.out.println(e+"    "+o);

	}

}
