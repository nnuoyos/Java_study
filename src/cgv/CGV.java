package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg="�ھ������ CGV �Դϴ�.��\n";
		String menuMsg = "�翹���ϱ�\n�豸���ϱ�\n������Ʈ��ȸ\n�곪����\n";
		String ageMsg="[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���\n";
		String films ="����̿�ŷ(08:00)\n�轺���̴���(12:00)\n����Ϸ���(23:00)[û�ҳ�����Ұ�]\n��ڷΰ���\n";
		String foods ="������\n���ݶ�\n�����\n��ڷΰ���\n";
		int choice = 0;
		int age =0;
		int money = 10000000;
		int point=0;
		int t_price = 10000;
		int f_price = 3000;
		boolean t_check; //���ſϷ����� �ƴ��� Ȯ���ϱ� 
		
		/*
		 * �����ϱ�
		 * 1.����
		 * 2.�ݶ�
		 * 3.����
		 * 4.�ڷΰ���
		 */
		
		
		while(true) {
		//���� �޴��̹Ƿ� ���ѹݺ��� �ȿ� ���� �׷��� �Ź� �޴��� �߰� �ȴ�
			t_check=true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 4) break; //��ܿ��� 3���� ������ �� ������ �޴��� �����ϹǷ� â�� ������
			//3�� ������� ���� if������ �ɷ�������, 1�� 2���� �ƴ� ��� ��Ƽ���� �ǵ��ư����� �����Ѵ�
			if(!(choice >=1 && choice <=3)) continue; 
			
				
			switch(choice) {
			//�����ϱ� ����
			case 1 :
				//������ ����
				if(money - t_price < 0) {
					JOptionPane.showMessageDialog(null, "�ܾ��� ���� �մϴ�");
					continue;
				}
				choice=Integer.parseInt(JOptionPane.showInputDialog(films));
				//choice�� ������ ������ �̹� �� ���Ǿ��� ������ ���⼭ �ٽ� ��� �����ϴ� "������ ����" �޸𸮸� �Ƴ� �� �ִ�
				if(choice==1) {
					
					JOptionPane.showMessageDialog(null, "���̿�ŷ ���� �Ϸ�(08:00)");
				}
				else if(choice ==2) {
					JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�(12:00)");
				}
				else if(choice==3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg)); //���̸� �Է¹޾� ���ؾ��ϹǷ� ������ ��ȯ Integer.parseInt
					if(age > 19) {
						JOptionPane.showMessageDialog(null, "���Ϸ��� ���� �Ϸ�(23:00)");						
					}
					else {
						 t_check = false; 
						 //û�� ��ȭ ���� üũ�ϱ�
						 //���⼭ ó������ false�� �������ٸ� �ٽ� true�� �ȹٲ�� �ֳ�? while�� �ۿ��� �����߱� ������ 
						 //���� ����ο� �ʱ�ȭ�� �����ϰ� while�� �ȿ��� true���� �־��ش�
						JOptionPane.showMessageDialog(null, "�ٽ� �õ��� �ּ���");		
					}
					
				}
				else {
					JOptionPane.showMessageDialog(null, "���θ޴��� �̵� �մϴ�.");
					continue;
				}
				if(t_check) { //t_check ����Ȯ���� �Ǿ��� �� ��ȭ�� ��������
					if(point > 0) {
						if(point - t_price >= 0) {
							point -= t_price; //����Ʈ�� Ƽ���� ������ �� ����
						}else {
							money -= (t_price-point); //Ƽ�� ���ݿ��� ����Ʈ�� �� ���� �� ���� ������ �� ������ ���ش�
							point = 0; //point�� 0���� �ʱ�ȭ
						}
					}else {
						money -= t_price;
						point += (int)(t_price * 0.5); //point 50% ����
					}
					JOptionPane.showMessageDialog(null, "���� �ܾ�: " +money+"��");						
					
				}
				break;
			//�����ϱ� ���� (����)
			case 2 :
				if(money - f_price < 0) {
					JOptionPane.showMessageDialog(null, "�ܾ��� ���� �մϴ�");
					continue;
				}
				choice=Integer.parseInt(JOptionPane.showInputDialog(foods));
				//choice�� ������ ������ �̹� �� ���Ǿ��� ������ ���⼭ �ٽ� ��� �����ϴ� "������ ����" �޸𸮸� �Ƴ� �� �ִ�
				if(choice==1) {
					
					JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");
				}
				else if(choice ==2) {
					JOptionPane.showMessageDialog(null, "�ݶ� ���� �Ϸ�");
				}
				else if(choice==3) {
					JOptionPane.showMessageDialog(null, "���� ���� �Ϸ�");
				}
				else {
					JOptionPane.showMessageDialog(null, "���θ޴��� �̵� �մϴ�.");
					continue;
				}
	
				if(point > 0) {
					if(point - f_price >= 0) {
						point -= f_price; //����Ʈ�� Ƽ���� ������ �� ����
					}else {
						money -= (f_price-point); //Ƽ�� ���ݿ��� ����Ʈ�� �� ���� �� ���� ������ �� ������ ���ش�
						point = 0; //point�� 0���� �ʱ�ȭ
					}
				}else {
					money -= f_price;
					point += (int)(f_price * 0.5); //point 50% ����
				}
				JOptionPane.showMessageDialog(null, "���� �ܾ�: " +money+"��");						
				break;
				
		
				//����Ʈ ��ȸ ����
			case 3 :
				JOptionPane.showMessageDialog(null, "�ܿ� ����Ʈ: "+ point + "��");
				break;
				
			}
				
		}		
	}
}

