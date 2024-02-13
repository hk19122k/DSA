import java.util.Arrays;

public class Selection_sort {

	public static void main(String[]args)
	{
		int[] a = {5,3,1,4,2};
		selection_sort(a);
		System.out.println(Arrays.toString(a));
	}

	 static void selection_sort(int[] a) {
		
		 
		 for(int i=0;i<a.length;i++)
		 {
			 int end = a.length-i-1;
			 int m = max(a,0,end);
			 swap(a,m,end);
		 }
	}

     static void swap(int[] a, int first, int second) {
		
    	 int t = a[first];
    	 a[first] = a[second];
    	 a[second] = t;
    	 
	}

	static int max(int[] a, int s, int end) {
	
    	int m =s;
    	for(int i =s;i<=end;i++)

    	{
    		if(a[i] > a[m])
    		{
    			m = a[i];
    		}
    	}
    	
		return m;
	}
}
