package arraysLearn;

public class DataTransferReverse {

	public static void main(String[] args) {

		int a[]=new int[100];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		
		int b[]=new int[100];
		
		int count=b.length;
		
		for(int i=0;i<a.length;i++)
		{
			b[--count]=a[i];
		}
		count=b.length-1;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[count--] + a[i]);   //99 2   101
			
		}
		

	}

}
