//Linear Search code
public class Linearsearch {

	public static void main(String[]args)
	{
		int[] arr = {12,34,55,78,2,88};
		int target = 222;
		int result = linear_search1(arr,target);
		System.out.println(result);
	}
	
	//to return an index
	static int linear_search1(int[] nums,int t)
	{
		if(nums.length == 0)
		{
			return -1;
		}
		for(int index = 0;index < nums.length;index++)
		{
			int e = nums[index];
			if(e == t)
			{
				return index;
			}
			
	    }
		return Integer.MAX_VALUE;
    }
		
	
}


