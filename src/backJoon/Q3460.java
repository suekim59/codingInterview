package backJoon;

import java.util.Scanner;

public class Q3460 {
	//이진수
	public static void main(String[] args) {
		//2021.05.20
		//1. 그냥 2진수 라이브러리 사용
		//2. 2로 나누면서 수 구하기
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt(); 
		for(int i = 1; i<=test ;i++) {
			int num = sc.nextInt();
			String temp = Integer.toBinaryString(num);
			String answer = "";
			int count = 0;
			for(int j =temp.length()-1; j>=0;j--) {
				if(temp.charAt(j) == '1') {
					answer += count+" ";
				}
				count++;
			}	
			System.out.println(answer);
		}
	}

}
