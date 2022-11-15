package FunctionsBestQuestionProblems;

public class RemoveDuplicatesfromSortedArrayII {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,1,2,3,3};
		int ans = removeDuplicates(nums);
		System.out.println(ans);

	}
	
	public static int removeDuplicates(int[] nums) {
		int k = 2; 
		for(int i = 2; i < nums.length; i++) {
			if(nums[i] > nums[k - 2]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

}

/*
Input: nums = [0,0,1,1,1,1,2,3,3]
Output: 7, nums = [0,0,1,1,2,3,3,_,_]
Explanation: Your function should return k = 7,
with the first seven elements
of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
It does not matter what you leave beyond the
returned k (hence they are underscores).

*/
