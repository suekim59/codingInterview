package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1226 {
	//2021.06.01
	//¹Ì·Î1
	static char [][] arr;
	static int startI;
	static int startJ;
	static boolean check;
	static boolean [][] visited;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int test_case = 1; test_case <= 10; test_case++){
			
			st = new StringTokenizer(br.readLine());
			int T = Integer.parseInt(st.nextToken());
			arr = new char [16][16];
			visited = new boolean[16][16];
			
			for(int i = 0; i<16;i++) {
				arr[i] = br.readLine().toCharArray();
				for(int j = 0; j<16;j++) {
					if(arr[i][j]=='2') {
						startI = i;
						startJ = j;
					}
				}
			}
			check = false;
			dfs(startI, startJ);
			
			if(check) {
				System.out.println("#"+T+" 1");
			}else {
				System.out.println("#"+T+" 0");
			}
		}
		
	}

	private static void dfs(int x, int y) {
		if(x<0 || y<0 || x>=16 || y>=16 || arr[x][y] =='1' || visited[x][y] == true ) {
			return;
		}
		
		if(arr[x][y] == '3') {
			visited[x][y]= true;
			check = true;
			return;
		}
		
		visited[x][y] = true;
		dfs(x-1, y);
		dfs(x, y-1);
		dfs(x+1, y);
		dfs(x, y+1);
		visited[x][y]= false;
		
	}

}
