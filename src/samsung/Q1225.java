package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1225 {
	//2021.06.01
	//암호생성기
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine());
			int T=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			Queue<Integer> q = new LinkedList<>();
				for(int i = 0; i<8;i++) {
					int num = Integer.parseInt(st.nextToken());
					q.add(num);
				}
			int cycle = 1;	
				
			while(true) {
				
				int temp = q.peek();
				if(temp-cycle <=0) {
					q.poll();
					q.add(0);
					break;
				}else {
					q.poll();
					q.add(temp-cycle);
					cycle++;
					if(cycle>5) {
						//5보다 커지면 1로 돌아감
						cycle=1;
					}
				}
				
			}
			
			String answer = "#"+T+" ";
			while(!q.isEmpty()) {
				answer += q.poll()+" ";
			}
			
			System.out.println(answer);

		}
		
		
		
	}

}
