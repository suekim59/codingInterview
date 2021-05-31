package backJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2460 {
	//2021.05.21
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int num=0;
		int max = Integer.MIN_VALUE;
		
		for(int i = 1;i<=10;i++) {
			st = new StringTokenizer(br.readLine());
			num -=Integer.parseInt(st.nextToken());
			num +=Integer.parseInt(st.nextToken());
			max = Math.max(max, num);
		}
		System.out.println(max);
	}

}
