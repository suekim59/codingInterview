package backJoon;

import java.util.Scanner;

public class Q3460 {
	//������
	public static void main(String[] args) {
		//2021.05.20
		//1. �׳� 2���� ���̺귯�� ���
		//2. 2�� �����鼭 �� ���ϱ�
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
