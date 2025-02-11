package arraysLearn;

public class ArraysAsParameters {

	
	public static int[] arrayParemeter(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=i+1;
		}
		return arr;
	}

	
	public static void printArrayData(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		
		int a[]=new int[1000];
		a=arrayParemeter(a);
		printArrayData(a);
	}

}
