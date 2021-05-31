package backJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2309_DFS {
	//일곱난쟁이
	//DFS 방식으로 풀기
	static int [] d;
	static boolean []visited;
	static ArrayList<Integer> list;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		d = new int[9];
		visited = new boolean[9];
		list = new ArrayList<>();
		for(int i =0; i<9;i++) {
			d[i]=sc.nextInt();
		}
		dfs(0);	
	}
	private static void dfs(int index) {
		
		if(list.size()==7) {
			int sum = 0;
			for(int i = 0; i<list.size();i++) {
				sum+=list.get(i);
			}
			if(sum==100) {
				Collections.sort(list);
				for(int j =0; j<list.size();j++) {
					System.out.println(list.get(j));	
				}
			}
			return;
		}
		
		for(int i = index;i<d.length;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				list.add(d[i]);
				dfs(i);
				visited[i]=false;
				list.remove(list.size()-1);
			}
		}
		
	}

}
