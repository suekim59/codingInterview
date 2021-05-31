package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
	//2021.05.22
	//Find and replace Pattern
	class Solution {
	    public List<String> findAndReplacePattern(String[] words, String pattern) {
	    	
	    	ArrayList<String> answer = new ArrayList<>();
	    	String p = solve(pattern);
	    	
	    	for(String word : words) {
	    		if(p.equals(solve(word))) {
	    			answer.add(word);
	    		}
	    	}
	    	
	    	return answer;	
	    }

		private String solve(String temp) {
			Map<Character, Character> map = new HashMap<>();
			int count =0;
			for(int i = 0; i<temp.length();i++) {
	    		char ch = temp.charAt(i);
	    		if(i==0 || i>0&&ch == temp.charAt(i-1)) {
	    			count++;
	    		}else {
	    			list.add(count);
	    			count=1;
	    		}
	    	}
			return list;
		}
	}

}
