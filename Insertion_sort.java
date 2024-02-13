import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[]args)
	{
		int[] a = {99,-21,0,87,888};
		Insertionsort(a);
		System.out.println(Arrays.toString(a));
		
	}

	static void Insertionsort(int[] a) {
		 
		for(int i =0;i<a.length-1;i++)
		{
			for(int j = i+1;j>0;j--)
			{
				if(a[j] < a[j-1])     // j =1 j-1 = 0 , so 3 < 5 
				{
					swap(a,j,j-1);
				}
				else
				{
					break;
				}
			}
		}
		
	}
	 static void swap(int[] a, int first, int second) {
			
    	 int t = a[first];
    	 a[first] = a[second];
    	 a[second] = t;
    	 
	}
}
