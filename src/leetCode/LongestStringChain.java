package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
	
	//2021.05.18
	//�� ���ڿ��� �����ϴ� �ܾ��θ� ����� �� ����
	//Instead of adding a character, try deleting a character to form a chain in reverse
	//For each word in order of length, for each word2 which is word with one character removed, length[word2] = max(length[word2], length[word] + 1).
	//Bottom-up DP
	public static void main(String[] args) {
		
		String[] words = {"a","b","ba","bca","bda","bdca"};
		longestStrChain(words);
		
	}
	public static int longestStrChain(String [] words) {
		//contains ���Ұ� X
		Map<String, Integer> dp = new HashMap<>();
		int count = 0; 
		
		for(String word : words) {
			int max = 0;
			for(int i = 0; i<word.length();i++) {
				//�ϳ��� �����ִ� ����
				String temp = word.substring(0,i)+word.substring(i+1);
				max= Math.max(max, dp.getOrDefault(temp, 0)+1);
			}
			dp.put(word, max);
			count = Math.max(max, count);
		}
		return count;
		
		
    }
	
	

}
