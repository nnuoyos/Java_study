package day09;

import java.util.Iterator;
import java.util.Scanner;

public class ArShop {
	//매출액 구하기
	//zara 
	//강남점, 코엑스점, 명동점
	//단위: 백만원 
	//단, 평균 매출액은 만원 단위까지 출력한다. 소수점 2째 자리 까지
	public static void main(String[] args) {

		int [] arIncome = new int[3];
		String [] arName= {"강남점","코엑스점","명동점"};
		int sum=0;
		int cnt=0;
		double avg=0.0;
		String best = "없음"; //초기값을 없음으로 하기, 해당하는 값이 없으면 if문에 들어가지 않는다
		Scanner sc = new Scanner(System.in);
				
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(arName[i] + "매출액을 입력하세요: (단위:백만원)");
			arIncome[i]=sc.nextInt();
			sum+=arIncome[i];
		}
		
		avg=Double.parseDouble(String.format("%.2f", (double)sum/ arIncome.length));
		System.out.println("zara 총 매출액 : "+ sum + "백만원");
		System.out.println("평균 매출액 : " + avg + "만원");
		
		
	
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i]>avg) {
				cnt++;
				if(cnt==1) best=""; //맨 처음에만 한번 초기화 하기
				
				best += arName[i] + "\n";
			}
		}
		System.out.println("★인센티브 매장★\n" + best);
		
	}
}
