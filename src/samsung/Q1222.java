package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Q1222 {
	//2021.05.24
	//계산기 1
	public static void main(String[] args) throws IOException {
		//중위 -> 후위
		//1. 숫자 일 경우, 바로 출력
		//2. 숫자가 아닐 경우, -> 스택 empty : 스택에 넣기
		//                -> 스택 no empty : 스택에서 꺼내서 출력
		//3. 다 끝내고 나서는 stack이 empty될 때까지 꺼내주기
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int num =Integer.parseInt(st.nextToken());//string 길이
			st = new StringTokenizer(br.readLine());
			Stack <Character> stack = new Stack<>();
			
			String s = st.nextToken();
			String result = "";
			for(int i = 0; i<s.length();i++) {
				char ch = s.charAt(i);
				if(ch>='0' && ch<='9') {
					result+=ch;
				}else {
					if(stack.isEmpty()) {
						stack.push(ch);
					}else {
						result+=stack.pop();
						stack.push(ch);
					}	
				}
			}
			
			while(!stack.isEmpty()) {
				result+=stack.pop();
			}
			int answer = cal(result);
			System.out.println("#"+test_case+" "+answer);

		}
		
	}

	private static int cal(String result) {
		//후위-> 계산
		//1. 숫자 일 경우, stack에 넣기
		//2. 연산자 나올 경우, 두 개 뽑아내기 -> 두 번째에 꺼낸 것이 앞 순서
		//      계산한 결과, 다시 stack에 집어넣기
		Stack <Integer> stack2 = new Stack<>();
		for(int i =0; i<result.length();i++) {
			char ch = result.charAt(i);
			if(ch>='0' && ch<='9') {
				int temp = Character.getNumericValue(ch);
				stack2.push(temp);
			}else {
				int num2 = stack2.pop();
				int num1 = stack2.pop();
				int sum = num1+num2;
				stack2.push(sum);
			}
		}
		
		return stack2.pop();
		
	}

}
