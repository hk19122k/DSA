
public class Binarysearch {

	public static void main(String[]args) 
	{
	 
//		int[] a = {1,2,5,24,54,67,89,122,898};
		int[] a = {111,87,67,27,19,17,2,4};
		int t = 111;
		System.out.println(Linearsearch(a,t));
		
	}

	 static int Linearsearch(int[] a, int t) {
		// TODO Auto-generated method stub
		 
		 int s =0;
		 int e = a.length-1;
		 
		 //check whether our array is ascending or descending 
		 boolean isAsc = (a[s] < a[e]);
		 
		 while(s <= e)
		 {
			 int mid = s+(e-s)/2;
			 if(a[mid] == t)
			 {
				 return mid;
			 }
			 if(isAsc)
			 {
				 if(a[mid] > t)
				 {
					 e = mid-1;
				 }
				 else if(t > a[mid])
				 {
					 s =mid+1;
				 }
			 }
			 else
			 {
				 if(a[mid] < t)
				 {
					 e = mid-1;
				 }
				 else if(t > a[mid])
				 {
					 s =mid+1;
				 }
			 }	 
		 }
		 
		 
		return -1;
	}

	
}
