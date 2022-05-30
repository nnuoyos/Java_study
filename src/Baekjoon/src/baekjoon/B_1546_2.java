package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class B_1546_2 {
	//평균은 넘겠지
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int sum=0;
		double avg=0;
		double avgOver=0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			double [] arr = new double[num];
			sum=0;
			avgOver=0;
			for(int j=0; j<num; j++) {
				arr[j]=Integer.parseInt(st.nextToken());
				sum+=arr[j];
				//평균 넘는 갯수 구해서 avgOver/num*100 출력
			}
			
			avg=sum/num;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]>avg) {
					avgOver++;
				}
			}
			System.out.printf("%.3f%s%n", avgOver/num*100,"%");
			
		}
		
	}
}

