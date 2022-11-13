package FunctionsBestQuestionProblems;

import java.util.*;

public class SumOfArrays {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = {43, 54, 321, 745, 345, 124, 575828582};
		
		for(int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int sum = 0;
			while(num != 0) {
				int rem = num % 10;
				sum += rem;
				num = num/10;
			}
			list.add(sum);
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
