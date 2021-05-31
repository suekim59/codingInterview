package backJoon;

import java.util.Scanner;

public class Q10870 {
	
	//2021.05.21
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int [] dp = new int[num+1];
		//dp[1]=1; //0일 경우에, 1을 벗어나기 때문에!!
		for(int i =0;i<dp.length;i++) {
			if(i==0) dp[0]=0;
			else if(i==1) dp[1]=1;
			else dp[i]=dp[i-1]+dp[i-2];
		}
		
		System.out.println(dp[num]);
	}

}
