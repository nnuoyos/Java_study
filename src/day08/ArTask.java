package day08;

public class ArTask {
	public static void main(String[] args) {
		
		//�迭 ���� �� 1~5������ �� �ֱ� (for�� ���)
		int [] arNum = new int[5];
		int [] arNum2 = new int[10];
				
		for (int i = 0; i < arNum.length; i++) {
			arNum[i]=i+1;
		}
		for (int i = 0; i < arNum.length; i++) {
			System.out.println(arNum[i]);
		}
		
		//�迭 ���� �� 10~1���� �� �ֱ� (for��)
		for (int i = 0; i < arNum2.length; i++) {
			arNum2[i]= 10-i;
			System.out.println(arNum2[i]);
		}
		
		
	}
}
