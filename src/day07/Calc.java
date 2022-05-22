package day07;

import java.util.Scanner;

/*
���� �����
1. ����ϱ�

1 + 1 =>next�� ������ �������� �ڸ��� next�� ���� ��� ��
2

2.������
*/
public class Calc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0;
		int choice=0;
		String menuMsg="1.����ϱ�\n2.������";
		String oper=""; //�ʱ�ȭ
		String result="";
		
		while(true) {
			System.out.println(menuMsg);
			choice=sc.nextInt(); //������ �޴� ��ȣ
			if(choice==2) {
				System.out.println("����");
				break; //2���� ������ �޴� 
			}
			if(choice!=1) continue; // �޴��� 1���� �ƴ� ���� �ٽ� �ǵ��ư���
			
			num1=Integer.parseInt(sc.next());
			oper = sc.next();
			num2=Integer.parseInt(sc.next());
			
			switch(oper) {
			case "+" :
				result=""+(num1+num2); // result = num1 + num2 ��� �ϸ� int�� ��� ������ ����ȯ�� ���ش�
				break;
			case "-" :
				result=""+(num1-num2);
				break;
			case "*" :
				result=""+(num1*num2);
				break;
			case "/" :
				if(num2 != 0) {
					result=""+(num1/num2);
				}
				else {
					result = "0���� ���� �� �����ϴ�";
				}
				break;
				default:
					result ="��Ģ���� ���� �����ڴ� ��� �� �� �����ϴ�";
			}
			System.out.println(result);
		}
		sc.close();
	}
}
