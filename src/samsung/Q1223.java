package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1223 {
	//2021.5.24
	//계산기2
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			String result = "";
			Stack<Character> st1 = new Stack<>(); 
			
			for(int i = 0; i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch>='0' && ch <='9') {
					result+=ch;
				}else {
					if(st1.isEmpty()) {
						st1.push(ch);
					}else {
						char temp = st1.peek(); //제일 위에 있는 것
						//우선순위가 더 높은 게 stack에 들어있을 때
						if(priority(temp)<=priority(ch)) {
							result+=st1.pop();
							st1.push(ch);
						}else {
							st1.push(ch);	
						}
					}
				}
			}//for문 완료
			while(!st1.isEmpty()) {
				result+=st1.pop();
			}
			System.out.println(result);
			int answer = cal(result);
			System.out.println("#"+test_case+" "+answer);
		}
			
	}

	private static int cal(String result) {
		
		Stack<Integer> st2 = new Stack<>();
		for(int i = 0; i<result.length();i++) {
			char ch = result.charAt(i);
			if(ch>='0' && ch<='9') {
				int n = Character.getNumericValue(ch);
				System.out.println(n);
				st2.push(n);
			}else {
				int num2 = st2.pop();
				int num1 = st2.pop();
				if(ch=='*') {
						st2.push(num1 * num2);
				}else if(ch =='+') {
						st2.push(num1 + num2);
				}
			}	
		}
		return st2.pop();
	}
	
	public static int priority(char ch) {
		if(ch =='*') {
			return 1;
		}else if(ch =='+') {
			return 3;
		}else {
			return -1;
		}
	}
}
