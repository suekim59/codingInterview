package samsung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1228 {
	//2021.06.04
	//암호문1
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int test_case = 1; test_case <= 10; test_case++){
			int length = Integer.parseInt(br.readLine());
			//length = Math.max(length, 10);
			int [] arr = new int[length];
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i<length;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				System.out.println(arr[i]);
			}
			int num = Integer.parseInt(br.readLine());
			String order = br.readLine();
			System.out.println(order);
			String [] o = order.split("I");
			
			for(int i = 1; 
					i<o.length;i++) {
				String temp = o[i];
				System.out.println();
				String [] t = temp.split(" ");
				int index = Integer.parseInt(t[1]); //여기 이후부터 넣어야 함
				int end = Math.max(Integer.parseInt(t[2])+index, length);
				int p = 3;
				for(int j = index; j<end;j++) {
					arr[j] = Integer.parseInt(t[p]);
					p++;
				}
			}
			String answer = "#"+test_case+" ";
			for(int i = 0; i<10;i++ ) {
				answer+=arr[i];
			}
			
			System.out.println(answer);


		}
		
		
	}

}
