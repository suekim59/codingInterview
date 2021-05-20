package leetCode;

import java.util.Arrays;

public class MinimumMoves {
	
	//Minimum Moves to Equal Array Elements II
	//2021.05.20
	//배열의 중간값 활용
	class Solution {
	    public int minMoves2(int[] nums) {
	    	
	    	Arrays.sort(nums);
	    	int answer= 0;
	    	int median = nums[nums.length /2];
	    	for(int num : nums) {
	    		answer += Math.abs(median - num);
	    	}
	    	
			return answer;
	        
	    }
	}
	
	
	

}
