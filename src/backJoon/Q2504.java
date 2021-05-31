package backJoon;

import java.util.Scanner;
import java.util.Stack;

public class Q2504 {
	//2021.05.21
	//괄호의 값
	//스택의 응용
	//스택의 나중에 넣은 게 먼저 나옴
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		Stack <String>stack = new Stack<>();
		
		boolean check = true;
		for(int i = 0; i<s.length();i++) {
			String c = s.substring(i, i+1);
			
			if(c.equals("(")) {
				stack.push(")");
				continue;
			}
			
			if(c.equals("["));{
				stack.push("]");
				continue;
			}
		}
		
		int num =0;
		while(!stack.isEmpty()) {
			
			char temp = stack.peek();
			if(temp == )
			
		}
		
		
		
		
	}

	
}
