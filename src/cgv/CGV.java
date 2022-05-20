package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg="★어서오세요 CGV 입니다.★\n";
		String menuMsg = "①예매하기\n②구매하기\n③포인트조회\n④나가기\n";
		String ageMsg="[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		String films ="①라이온킹(08:00)\n②스파이더맨(12:00)\n③사일런스(23:00)[청소년관람불가]\n④뒤로가기\n";
		String foods ="①팝콘\n②콜라\n③맥주\n④뒤로가기\n";
		int choice = 0;
		int age =0;
		int money = 10000000;
		int point=0;
		int t_price = 10000;
		int f_price = 3000;
		boolean t_check; //예매완료인지 아닌지 확인하기 
		
		/*
		 * 구매하기
		 * 1.팝콘
		 * 2.콜라
		 * 3.맥주
		 * 4.뒤로가기
		 */
		
		
		while(true) {
		//메인 메뉴이므로 무한반복문 안에 들어가서 그래야 매번 메뉴가 뜨게 된다
			t_check=true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 4) break; //뷰단에서 3번을 선택할 시 나가기 메뉴를 선택하므로 창이 꺼진다
			//3번 나가기는 위의 if문으로 걸러졌으니, 1과 2번이 아닐 경우 컨티뉴로 되돌아가도록 설정한다
			if(!(choice >=1 && choice <=3)) continue; 
			
				
			switch(choice) {
			//예매하기 영역
			case 1 :
				//변수의 재사용
				if(money - t_price < 0) {
					JOptionPane.showMessageDialog(null, "잔액이 부족 합니다");
					continue;
				}
				choice=Integer.parseInt(JOptionPane.showInputDialog(films));
				//choice의 역할은 위에서 이미 다 사용되었기 때문에 여기서 다시 사용 가능하다 "변수의 재사용" 메모리를 아낄 수 있다
				if(choice==1) {
					
					JOptionPane.showMessageDialog(null, "라이온킹 예매 완료(08:00)");
				}
				else if(choice ==2) {
					JOptionPane.showMessageDialog(null, "스파이더맨 예매 완료(12:00)");
				}
				else if(choice==3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg)); //나이를 입력받아 비교해야하므로 정수로 변환 Integer.parseInt
					if(age > 19) {
						JOptionPane.showMessageDialog(null, "사일런스 예매 완료(23:00)");						
					}
					else {
						 t_check = false; 
						 //청불 영화 나이 체크하기
						 //여기서 처음으로 false로 만들어줬다면 다시 true로 안바뀐다 왜냐? while문 밖에서 선언했기 때문에 
						 //따라서 선언부에 초기화로 선언하고 while문 안에서 true값을 넣어준다
						JOptionPane.showMessageDialog(null, "다시 시도해 주세요");		
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "메인메뉴로 이동 합니다.");
					continue;
				}
				if(t_check) { //t_check 예매확인이 되었을 때 영화비 빠져나감
					if(point > 0) {
						if(point - t_price >= 0) {
							point -= t_price; //포인트로 티켓을 구매할 수 있음
						}else {
							money -= (t_price-point); //티켓 가격에서 포인트를 뺀 다음 그 남은 차액은 내 돈에서 빼준다
							point = 0; //point를 0으로 초기화
						}
					}else {
						money -= t_price;
						point += (int)(t_price * 0.5); //point 50% 적립
					}
					JOptionPane.showMessageDialog(null, "현재 잔액: " +money+"원");						
					
				}
				break;
			//구매하기 영역 (매점)
			case 2 :
				if(money - f_price < 0) {
					JOptionPane.showMessageDialog(null, "잔액이 부족 합니다");
					continue;
				}
				choice=Integer.parseInt(JOptionPane.showInputDialog(foods));
				//choice의 역할은 위에서 이미 다 사용되었기 때문에 여기서 다시 사용 가능하다 "변수의 재사용" 메모리를 아낄 수 있다
				if(choice==1) {
					
					JOptionPane.showMessageDialog(null, "팝콘 구매 완료");
				}
				else if(choice ==2) {
					JOptionPane.showMessageDialog(null, "콜라 구매 완료");
				}
				else if(choice==3) {
					JOptionPane.showMessageDialog(null, "맥주 구매 완료");
				}
				else {
					JOptionPane.showMessageDialog(null, "메인메뉴로 이동 합니다.");
					continue;
				}
	
				if(point > 0) {
					if(point - f_price >= 0) {
						point -= f_price; //포인트로 티켓을 구매할 수 있음
					}else {
						money -= (f_price-point); //티켓 가격에서 포인트를 뺀 다음 그 남은 차액은 내 돈에서 빼준다
						point = 0; //point를 0으로 초기화
					}
				}else {
					money -= f_price;
					point += (int)(f_price * 0.5); //point 50% 적립
				}
				JOptionPane.showMessageDialog(null, "현재 잔액: " +money+"원");						
				break;
				
		
				//포인트 조회 영역
			case 3 :
				JOptionPane.showMessageDialog(null, "잔여 포인트: "+ point + "점");
				break;
				
			}
				
		}		
	}
}

