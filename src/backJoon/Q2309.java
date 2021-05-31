package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309 {
	//2021.05.21
	//ÀÏ°ö ³­ÀïÀÌ
	static int [] d;
	static int [] answer;
	static int sum;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		d = new int [9];
		answer = new int[7];
		sum=0;
		for(int i =0; i<9;i++) {
			d[i] = sc.nextInt();
			sum+=d[i];
		}
		Arrays.sort(d);
		//ÀÏ°ö ³­ÀïÀÌÀÇ Å°ÀÇ ÇÕÀÌ 100ÀÌ µÇ¾ßÇÔ
		boolean check = false;
		for(int i = 0; i<d.length-1;i++) {
			for(int j = i+1 ;j<d.length;j++) {
				if(sum - d[i] - d[j] == 100) {
					d[i] = -1;
					d[j]=-1;
					check = true;
					break;
				}
			}
			if(check == true) {
				break;
			}
		}
		
		for(int num : d) {
			if(num != -1) {
				System.out.println(num);
			}
		}
		
	
	}

}
