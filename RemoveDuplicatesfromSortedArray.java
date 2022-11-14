package FunctionsBestQuestionProblems;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));

	}
	
	public static int removeDuplicates(int[] nums) {
		int k = 1;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > nums[k - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}

}