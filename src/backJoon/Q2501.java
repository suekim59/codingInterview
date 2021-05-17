package backJoon;

import java.util.Scanner;

public class Q2501 {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		//N의 약수들 중 K번째로 작은 수
		//변수를 최대한 적게 사용할 수 있도록 하자!!!
		//K번째 약수가 존재하지 않을 경우, 0으로 출력해야 한다는 조건을 제대로 확인하지 않음!
		//왜 K를 -1 먼저 제외해준 건 안되는 걸까..? -> 아 K가 1일 경우에는 나누어 떨어지는 게 없기 때문에 
		// 저 안쪽의 if 문으로 들어가지 않네....
		
		
		for(int i = 1; i<= N ;i++) {
			if(N%i == 0) {
				K--;
				if(K == 0) {
					System.out.println(i);
					break;
				}
			}
		}
		if( K != 0) {
			System.out.println(0);
		}
	}
	
}
