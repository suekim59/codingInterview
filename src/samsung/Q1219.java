package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1219 {
	//2021.05.24
	//길 찾기
	static StringTokenizer st;
	static boolean check;
	static int [] arr1;
	static int [] arr2;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case = 1; test_case <= 10; test_case++)
		{
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); //test_case 순서
			int count = Integer.parseInt(st.nextToken()); //총 받을 수 있는 수
			arr1 = new int[100];
			arr2 = new int[100];
			st= new StringTokenizer(br.readLine());
			
			for(int i =0; i<count ;i++) {		
				int index = Integer.parseInt(st.nextToken());
				int connect = Integer.parseInt(st.nextToken());
				if(arr1[index] == 0) {
					arr1[index]=connect;
				}else {
					arr2[index]=connect;
				}
			}
			
			check = false;
			dfs(0);
			
			if(check) {
				System.out.println("#"+num+" "+1);
			}else {
				System.out.println("#"+num+" "+0);	
			}

		}
		
	}
	private static void dfs(int i) {
		if(i == 99) {
			check = true;
			return;
		}
		
		if(arr1[i] != 0) {
			dfs(arr1[i]);
		}
		if(arr2[i] != 0) {
			dfs(arr2[i]);
		}
	}

}
