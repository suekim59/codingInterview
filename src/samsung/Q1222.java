package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Q1222 {
	//2021.05.24
	//���� 1
	public static void main(String[] args) throws IOException {
		//���� -> ����
		//1. ���� �� ���, �ٷ� ���
		//2. ���ڰ� �ƴ� ���, -> ���� empty : ���ÿ� �ֱ�
		//                -> ���� no empty : ���ÿ��� ������ ���
		//3. �� ������ ������ stack�� empty�� ������ �����ֱ�
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int num =Integer.parseInt(st.nextToken());//string ����
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
		//����-> ���
		//1. ���� �� ���, stack�� �ֱ�
		//2. ������ ���� ���, �� �� �̾Ƴ��� -> �� ��°�� ���� ���� �� ����
		//      ����� ���, �ٽ� stack�� ����ֱ�
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
