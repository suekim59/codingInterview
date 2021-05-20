package backJoon;

import java.util.Scanner;

public class Q10818 {
	
	public static void main(String[] args) {
		//2021.05.20
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<num ;i++) {
			int temp = sc.nextInt();
			max = Math.max(temp, max);
			min = Math.min(min, temp);
		}
		System.out.println(min+" "+max);
	}

}
