package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		AmsField af = new AmsField(); //전역변수는 new를 만나는 순간 메모리에서 해제 된다. 단, Static 변수는 프로그램이 종료될 때 메모리에서 해제된다
		ImageIcon img = new ImageIcon("src/img/main.gif"); //생성자에 이미지 경로를 알려주기
		String [] arPlane = new String[5]; //정보가 5개 짜리의 배열
		//절대 경로 : 내 위치가 어디든지 찾아갈 수 있는 경로
		//상대 경로: 내 위치에 따라서 변경 되는 경로
		String keyword="";
		String [] menu = {"추가하기", "검색하기", "수정하기", "삭제하기", "목록보기"};
		String [] searchMenu= {"항공사", "항공기 번호", "최대 승객수", "출발지", "도착지"};
		String [] updateMenu = {"출발지 수정", "도착지 수정"};
		
		int choice = 0;
		int index = 0;
		
		String insertMsg="[추가하실 정보를 그대로 입력하세요(,포함)]\n"
				+ "항공사, 항공기번호, 최대승객수, 출발지, 도착지";
		String searchMsg= "검색하실 항공사를 입력하세요\n";
		String deleteMsg= "검색하실 항공기 번호를 입력하세요\n";
		String updateMsg = "수정하실 항공기 번호를 입력하세요\n";
		
		
		while(true) {
			
		choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, menu , null);
		
		if(choice == -1)  break;
		
		switch(choice) { //입력이 아닌 버튼형식이므로 마지막의 디폴트는 필요없다
		//추가하기 
		case 0 :
			arPlane=JOptionPane.showInputDialog(insertMsg).split(", "); //문자열을 나눠주기 
			af.insert(arPlane);
			break;
		//검색하기
		case 1 :
			index= JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
			//이렇게 통째로를 인덱스 번호로 보면 된다
			if(index != -1) {				
			keyword = JOptionPane.showInputDialog("검색하실 " + searchMenu[index] + "을(를) 입력하세요"); //규칙성을 부여하기 위해 배열 사용
			JOptionPane.showMessageDialog(null, af.search(keyword, index));
			}
			break;
			
		//수정하기
		//출발지 수정, 목적지 수정 버튼 만들기 
		//JOptionPane.showOptionDialog() 사용하기 => 항공기 번호가 존재할 때
		//항공기 번호 입력 받고 해당 항공기의 출발지와 목적지 수정
		//출발지와 목적지가 동일하면 수정 실패
		case 2 :
			String planeNum = JOptionPane.showInputDialog(updateMsg); //버튼 만들어주기
			String temp = af.search(planeNum, 1); //수정시에는 항공기 번호만 필요하기 때문에 1열로 넘겨준다. 입력한 항공기번호가 1열에 있는지 검사하기
			
			if(temp.equals("검색 결과 없음")) {//1열(항공기 번호)로 검색 해서 검색결과없음 문자열값과 동일하면 검색이 안된것
			JOptionPane.showMessageDialog(null, "수정실패");
			}else {
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, updateMenu , null);
				//업데이트 메뉴를 버튼으로 만든다 
				if(index == -1) continue;
				if(index != -1) {
				String newValue=JOptionPane.showInputDialog("새로운 " + updateMenu[index] + "를 입력하세요");
				
				af.update(index, newValue);
				}
			}
			
			break;
			
		//삭제하기
		case 3 :
			keyword = JOptionPane.showInputDialog(deleteMsg);
			if(af.delete(keyword)) {
				JOptionPane.showMessageDialog(null, "삭제 완료");
			}else {
				JOptionPane.showMessageDialog(null, "삭제 실패");
			}
			break;
		//목록보기
		case 4 :
			JOptionPane.showMessageDialog(null, af.show());
			break;
		}
		
		}
	}
}
