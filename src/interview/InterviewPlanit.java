package interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class InterviewPlanit {

	//print string characters without duplicates (by using hash
	public static void main(String[] args) {

		String s = "India is my country";
		StringBuilder sb = new StringBuilder();
		System.out.println(s);
		Set<Character> set = new LinkedHashSet<Character>();
		
		
		for(int i=0; i<s.length(); i++) {
			 set.add(s.charAt(i));
			
		}
		
		for(char c : set) {
			sb.append(c);
		}
		System.out.println(sb);
		
		
	}

}
