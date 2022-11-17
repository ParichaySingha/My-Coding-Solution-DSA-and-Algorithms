package FunctionsBestQuestionProblems;

import java.util.*;

//leet code question #224
public class BasicCalculator {

	public static void main(String[] args) {
//		String s1 = " 1 + 1";
//		String s2 = " 2-1 + 2 ";
		String s3 = "(1+(4+5+2)-3)+(6+8)";
		System.out.println(calculate(s3));

	}
	/*
	//Given a string s representing a valid expression,
	//implement a basic calculator to evaluate it,
	//and return the result of the evaluation.
	*/
	
	 public static int calculate(String s) {
		 Stack<Integer> st = new Stack<Integer>();
		 int ans = 0;
		 int number = 0;
		 int sign = 1;
		 
		 for(int i = 0; i < s.length(); i++) {
			 char c = s.charAt(i);
			 if(Character.isDigit(c)) {
				 number = 10 * number + (int)(c - '0');
			 }
			 else if(c == '+') {
				 ans += sign * number;
				 number = 0;
				 sign = 1;
			 }
			 else if(c == '-') {
				 ans += sign * number;
				 number = 0;
				 sign = -1;
			 }
			 else if(c == '(') {
				 st.push(ans);
				 st.push(sign);
				 sign = 1;
				 ans = 0;
			 }else if(c == ')') {
				 ans += sign * number;
				 number = 0;
				 ans *= st.pop();
				 ans += st.pop();
			 }
		 }
		 if(number != 0) ans += sign * number;
		return ans;
	}
}
