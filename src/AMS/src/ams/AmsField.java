package ams;

import java.util.Iterator;

import javax.swing.JOptionPane;

//각 기능구현 메서드 만들기 
public class AmsField {
	//항공사, 항공기번호, 최대승객수, 출발지, 도착지
	//2차원배열[0] = 1차원배열;
	//추가하기
	
	String[][] arrPlane = new String[100][5]; //100행 5열
	int cnt; // 전역변수는 자동초기화, 프로그램이 끝날때 까지 기억
	int showCnt;
	int cLength = arrPlane[0].length; //열의 길이 = arrPlane[0]에 한번접근한 후-> 길이
	String result = "";
	int updateIndex;
	
	void insert(String [] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}
	//검색하기
	String search(String keyword, int index) {
		int arIndex[];
		String result="";
		int searchCnt =0;
		
		for (int i = 0; i < cnt; i++) {
			if(keyword.equals(arrPlane[i][index])) {
				searchCnt++; //검색 결과가 몇개인지 카운트에 담아두기
				updateIndex = i; //updateIndex에 검색된 행번호를 담아준다
				result += ""+i+","; //검색한 결과가 있다면, 그 행 번호[i]를 연결하겠다  
			}
		}
		arIndex = new int[searchCnt]; //위의 for문 안에서 검색이 다 끝난 다음 cnt만큼 배열칸을 만든다
		
		for (int i = 0; i < arIndex.length; i++) {
			arIndex[i] =Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex);
	}
		
	//수정하기
	void update(int btnIndex, String newValue) { //외부에서 받아올 값: 항공기 번호, 버튼인덱스, 수정할 값)
				arrPlane[updateIndex][btnIndex+3] = newValue; 
				//btnIndex 는 출발지 : 0 도착지일 때 : 1 버튼 두개이므로
				//열 index번호 = 출발지 인덱스번호:3 도착지 인덱스 번호:4 
			}
	

	//삭제하기
	boolean delete(String keyword) { //외부에서 받아오는 키워드(삭제할 키워드)
		boolean deleteCheck = false; //flag
		
		for (int i = 0; i < cnt; i++) {
			//arrPlane[i][1] i행의1열과 키워드가 같으면! 우리가 삭제하고자 하는 정보이다
			if(arrPlane[i][1].equals(keyword)) {
				//cnt - 1 : 마지막 정보가 담긴 행 
				//cnt : null이 담긴 행
				for (int j = i; j < cnt; j++) { //j=i j를 행번호로 시작하겠다
					arrPlane[j] = arrPlane[cnt+1]; //순서대로 밀어준다
				}
				deleteCheck = true;
				cnt--;
				break;
			}
		}
		return deleteCheck;
	}
	
	//목록보기
	String show() {
		
		String result = "항공사, 항공기 번호, 최대승객수(명), 출발지, 도착지\n"; 
		
		for (int i = 0; i < cnt; i++) { 
			result +=  "♥"; 
			for (int j = 0; j < cLength; j++) {
				result += j  == cLength-1 ? arrPlane[i][j] : arrPlane[i][j] + ",  "; 
				// arrPlane[i][j] => 한 비행기의 하나의 값!! 입력받은 값들이 항공사, 항공기 번호, ...로 출력되도록
				//삼항연산자를 이용하여 마지막 배열값일 때는 쉼표 없이 끝날 수 있게 한다
			}
			result += "\n";
		}
		if(cnt == 0) result = "목록 없음"; //입력한 정보가 없을 때 목록보기 누르면 보여질 문구
		return result;
	}
	
	
	//검색 결과 보기
	String show(int[] arIndex) {
		String result = "항공사, 항공기 번호, 최대승객수(명), 출발지, 도착지\n";
		
		for (int i = 0; i < arIndex.length; i++) { 
			result +=  "♥"; //처음 시작할때만 나오게 하기
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j]; //arIndex[i] 에는 행번호가 들어있다
				result += j == cLength - 1 ? "" : ",  "; //마지막에는 쉼표 붙이지 않겠다
			}
			result += "\n";
		}
		//검색결과 없을 때 조건
		if(arIndex.length==0) result = "검색 결과 없음";
		return result; //String 검색 결과가 result 에 담김
	}
		
}
