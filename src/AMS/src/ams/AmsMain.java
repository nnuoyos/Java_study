package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		AmsField af = new AmsField(); //���������� new�� ������ ���� �޸𸮿��� ���� �ȴ�. ��, Static ������ ���α׷��� ����� �� �޸𸮿��� �����ȴ�
		ImageIcon img = new ImageIcon("src/img/main.gif"); //�����ڿ� �̹��� ��θ� �˷��ֱ�
		String [] arPlane = new String[5]; //������ 5�� ¥���� �迭
		//���� ��� : �� ��ġ�� ������ ã�ư� �� �ִ� ���
		//��� ���: �� ��ġ�� ���� ���� �Ǵ� ���
		String keyword="";
		String [] menu = {"�߰��ϱ�", "�˻��ϱ�", "�����ϱ�", "�����ϱ�", "��Ϻ���"};
		String [] searchMenu= {"�װ���", "�װ��� ��ȣ", "�ִ� �°���", "�����", "������"};
		String [] updateMenu = {"����� ����", "������ ����"};
		
		int choice = 0;
		int index = 0;
		
		String insertMsg="[�߰��Ͻ� ������ �״�� �Է��ϼ���(,����)]\n"
				+ "�װ���, �װ����ȣ, �ִ�°���, �����, ������";
		String searchMsg= "�˻��Ͻ� �װ��縦 �Է��ϼ���\n";
		String deleteMsg= "�˻��Ͻ� �װ��� ��ȣ�� �Է��ϼ���\n";
		String updateMsg = "�����Ͻ� �װ��� ��ȣ�� �Է��ϼ���\n";
		
		
		while(true) {
			
		choice = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, menu , null);
		
		if(choice == -1)  break;
		
		switch(choice) { //�Է��� �ƴ� ��ư�����̹Ƿ� �������� ����Ʈ�� �ʿ����
		//�߰��ϱ� 
		case 0 :
			arPlane=JOptionPane.showInputDialog(insertMsg).split(", "); //���ڿ��� �����ֱ� 
			af.insert(arPlane);
			break;
		//�˻��ϱ�
		case 1 :
			index= JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, searchMenu, null);
			//�̷��� ��°�θ� �ε��� ��ȣ�� ���� �ȴ�
			if(index != -1) {				
			keyword = JOptionPane.showInputDialog("�˻��Ͻ� " + searchMenu[index] + "��(��) �Է��ϼ���"); //��Ģ���� �ο��ϱ� ���� �迭 ���
			JOptionPane.showMessageDialog(null, af.search(keyword, index));
			}
			break;
			
		//�����ϱ�
		//����� ����, ������ ���� ��ư ����� 
		//JOptionPane.showOptionDialog() ����ϱ� => �װ��� ��ȣ�� ������ ��
		//�װ��� ��ȣ �Է� �ް� �ش� �װ����� ������� ������ ����
		//������� �������� �����ϸ� ���� ����
		case 2 :
			String planeNum = JOptionPane.showInputDialog(updateMsg); //��ư ������ֱ�
			String temp = af.search(planeNum, 1); //�����ÿ��� �װ��� ��ȣ�� �ʿ��ϱ� ������ 1���� �Ѱ��ش�. �Է��� �װ����ȣ�� 1���� �ִ��� �˻��ϱ�
			
			if(temp.equals("�˻� ��� ����")) {//1��(�װ��� ��ȣ)�� �˻� �ؼ� �˻�������� ���ڿ����� �����ϸ� �˻��� �ȵȰ�
			JOptionPane.showMessageDialog(null, "��������");
			}else {
				index = JOptionPane.showOptionDialog(null, "", "AMS", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, img, updateMenu , null);
				//������Ʈ �޴��� ��ư���� ����� 
				if(index == -1) continue;
				if(index != -1) {
				String newValue=JOptionPane.showInputDialog("���ο� " + updateMenu[index] + "�� �Է��ϼ���");
				
				af.update(index, newValue);
				}
			}
			
			break;
			
		//�����ϱ�
		case 3 :
			keyword = JOptionPane.showInputDialog(deleteMsg);
			if(af.delete(keyword)) {
				JOptionPane.showMessageDialog(null, "���� �Ϸ�");
			}else {
				JOptionPane.showMessageDialog(null, "���� ����");
			}
			break;
		//��Ϻ���
		case 4 :
			JOptionPane.showMessageDialog(null, af.show());
			break;
		}
		
		}
	}
}
