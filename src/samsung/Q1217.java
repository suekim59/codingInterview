package samsung;

import java.util.Scanner;

public class Q1217 {
	//2021.05.24
	//stack1 - 4ÀÏÂ÷
	//°ÅµìÁ¦°ö
	public static int answer;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int M= sc.nextInt();
            
           answer = solve(N,M);
		   System.out.println(answer);

		}
	}

	private static int solve(int n, int m) {
		
		if(m==0) {
			return 1;
		}
		answer = n * solve(n,m-1);
		return answer;
	}
		
		
	}

