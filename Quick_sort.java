import java.util.Arrays;

public class Quick_sort {

	public static void main(String[]args)
	{
	int[] a = {13,23,34,52,45,98,2,42,1};
	sort(a,0,a.length-1);
	System.out.println(Arrays.toString(a));
	}

	 static void sort(int[] a, int low, int high) {
		    
		 
		    int s = low;
			int e = high;
			int m = s+(e-s)/2;
			int pivot = a[m];
		 
		 
		 if(s >= e)
		{
			return;
		}
		
		
		while(s <= e)
		{
			while(a[s] < pivot)
			{
				s++;
			}
			while(a[e] > pivot)
			{
				e--;
			}
			if(s<=e)
			{
				int t = a[s];
				a[s] =a[e];
				a[e] = t;
				s++;
				e--;
			}
	}
		
		sort(a,low,e);
		sort(a,s,high);
}
}
