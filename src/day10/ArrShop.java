package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrShop {
	//나이키
	//강남점 홍대점 명동점
	//성인, 키즈
	//강남점a, 홍대점a, 신촌점a 
	//강남점k, 홍대점k, 신촌점k
	
	public static void main(String[] args) {
		int [][] arrIncome = new int [2][3];
		int [] arASum=new int [2]; //키즈/성인 연령별 총 매출액
		int [] arBSum= new int [3];  //강남,홍대,신촌  지점별 총 매출액
		int sum=0;
		double [] aAvg= new double[2]; //평균 2개 나옴 => 배열로 만들기
		double [] bAvg= new double[3];
		double Avg=0.0;
		int rLength = arrIncome.length; //행의 길이
		int cLength = arrIncome[0].length; //열의 길이
		
		String result="";
		String[][] arrName= {
				{"강남점A","홍대점A","신촌점A"},
				{"강남점K","홍대점K","신촌점K"}
		};
		/*
		A / 3 adult 매장들의 평균 
		K / 3 kids 매장들의 평균
		*/
		
		String [] arAName = {"성인","키즈"};
		String [] arBName = {"강남점","홍대점","신촌점"};
		String inputMsg="매출액을 입력하세요";
		
		for(int i=0; i<rLength; i++) { //숫자로 적게 되면 추후 수정이 귀찮으므로 배열 길이를 넣어준다
			for(int j=0; j<cLength; j++) { 
				arrIncome[i][j]=Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j]+" "+inputMsg));
				arASum[i] += arrIncome[i][j]; //연령별 매출액
				//반복문 실행: i 가 0일때, 0번째 방에 강남점A 의 매출액이 들어감
				//그 다음 j가 1이 되고 홍대점A 매출액, j=2 신촌점A가 차례대로 들어감
				arBSum[j] += arrIncome[i][j]; //지점별 매출액 
				sum+=arrIncome[i][j]; //총매출액
			}
		}
		for(int i=0; i<aAvg.length; i++) {
			aAvg[i]=Double.parseDouble(String.format("%.2f",(double)arASum[i] / arBSum.length)); //연령별 평균
		}
		for(int i=0; i<bAvg.length; i++) {
			bAvg[i]=Double.parseDouble(String.format("%.2f",(double)arBSum[i] / arASum.length)); //연령별 평균
		}
		
		Avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength*cLength))); //합계를 총 매장수만큼 나눠준다
		
		for(int i=0; i<rLength; i++) {
			for(int j=0; j<cLength; j++) {
				result += arrName[i][j]+"매출액: " + arrIncome[i][j] + "만원\n"; //성인매장의 매출
			}
			//연령별 매출액
			result += arAName[i] + "총 매출액: " + arASum[i] + "만원\n";
			result += arAName[i] + "평균 매출액: " + aAvg[i] + "만원\n";
		}
		
		for(int i=0; i<arBSum.length; i++) {
			result += arBName[i]+ "총 매출액: " + arBSum[i]+ "만원\n";
			result += arBName[i]+ "평균 매출액: " + bAvg[i]+ "만원\n";
		}
		result += "총 매출액: " + sum + "만원\n";
		result += "평균 매출액: " + Avg + "만원\n";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
