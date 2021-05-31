package samsung;

import java.util.Scanner;
import java.util.Stack;

public class Q1218 {
	
	public static void main(String[] args) {
		//2021.05.24
		//괄호 짝 찾기
		
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int num = sc.nextInt(); //테스트 케이스 길이
			String s = sc.next();
			char [] arr = s.toCharArray();
			Stack<Character> stack = new Stack<>();
			
			for(int i =0; i<arr.length;i++) {
				
				char temp = arr[i];
				if(temp ==')' && stack.peek() =='(') {
					stack.pop();
				}else if(temp=='}'&& stack.peek()=='{') {
					stack.pop();
				}else if(temp==']' && stack.peek() =='[') {
					stack.pop();
				}else if(temp =='>' && stack.peek() =='<') {
					stack.pop();
				} else {
					stack.push(temp);
				}
				
			}
			
			if(stack.isEmpty()) {
				System.out.println("#"+test_case+" "+1);
			}else {
				System.out.println("#"+test_case+" "+0);
			}
		}
	}
	

}
