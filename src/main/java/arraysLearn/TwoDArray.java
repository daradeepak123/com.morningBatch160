package arraysLearn;

public class TwoDArray {

	public static void main(String[] args) {

		int a[][][]=new int[4][4][4];
		
		
		for(int i=0;i<a[0].length;i++)   // 0
		{
			int num=1;
			for(int j=0;j<a[1].length;j++) //1
			{
				for(int k=0;k<a[2].length;k++) //1
				{
				a[i][j][k]=num++; 
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				for(int k=0;k<a[2].length;k++) //1
				{

					System.out.print(a[i][j][k]+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
		
		
		

	}

}
