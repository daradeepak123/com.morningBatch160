package loops;

public class NestedLoopCount {

	public static void main(String[] args) {
		
		int ucount=0;
		int icount=0;
		
		
		for(int i=1;i<3;i++)
		{
			ucount++;
			for(int j=1;j<3;j++)
			{
				icount++;
			}

		}
		
		
		System.out.println(ucount+"     "+icount);
		

	}

}
