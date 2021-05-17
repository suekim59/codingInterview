package backJoon;

import java.util.Scanner;

public class Q14888 {
	//백트래킹 //재귀
	static int [] num;
	static int [] op= new int[4];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		num = new int[N];
		for(int i = 0; i<N;i++) {
			num[i] = sc.nextInt();
		}
	
		for(int i = 0; i<4;i++) {
			op[i] = sc.nextInt();
		}
		
		dfs(num[0], 1);
	
		//max랑 min이 같을 수도 있음
		System.out.println(max);
		System.out.println(min);
	}

	private static void dfs(int sum, int index) {
		
		if(index == N) {
			max = Math.max(max, sum);
			min = Math.min(max, sum);
			return;
		}
		
		for( int i = 0; i<4;i++) {
			if(op[i]>0) {
				op[i]--;
				
				switch(i) {
				
				case 0 : dfs(sum + num[index], index+1); break;
				case 1 : dfs(sum - num[index], index +1); break;
				case 2 : dfs(sum * num[index], index +1); break;
				case 3 : dfs(sum / num[index], index +1); break;
				
				}
				//다시 해당 연산자 복구
				op[i]++;
				
				
			}
			
		}
		
	}

}
