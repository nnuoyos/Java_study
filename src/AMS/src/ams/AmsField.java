package ams;

import java.util.Iterator;

import javax.swing.JOptionPane;

//�� ��ɱ��� �޼��� ����� 
public class AmsField {
	//�װ���, �װ����ȣ, �ִ�°���, �����, ������
	//2�����迭[0] = 1�����迭;
	//�߰��ϱ�
	
	String[][] arrPlane = new String[100][5]; //100�� 5��
	int cnt; // ���������� �ڵ��ʱ�ȭ, ���α׷��� ������ ���� ���
	int showCnt;
	int cLength = arrPlane[0].length; //���� ���� = arrPlane[0]�� �ѹ������� ��-> ����
	String result = "";
	int updateIndex;
	
	void insert(String [] arPlane) {
		arrPlane[cnt] = arPlane;
		cnt++;
	}
	//�˻��ϱ�
	String search(String keyword, int index) {
		int arIndex[];
		String result="";
		int searchCnt =0;
		
		for (int i = 0; i < cnt; i++) {
			if(keyword.equals(arrPlane[i][index])) {
				searchCnt++; //�˻� ����� ����� ī��Ʈ�� ��Ƶα�
				updateIndex = i; //updateIndex�� �˻��� ���ȣ�� ����ش�
				result += ""+i+","; //�˻��� ����� �ִٸ�, �� �� ��ȣ[i]�� �����ϰڴ�  
			}
		}
		arIndex = new int[searchCnt]; //���� for�� �ȿ��� �˻��� �� ���� ���� cnt��ŭ �迭ĭ�� �����
		
		for (int i = 0; i < arIndex.length; i++) {
			arIndex[i] =Integer.parseInt(result.split(",")[i]);
		}
		return show(arIndex);
	}
		
	//�����ϱ�
	void update(int btnIndex, String newValue) { //�ܺο��� �޾ƿ� ��: �װ��� ��ȣ, ��ư�ε���, ������ ��)
				arrPlane[updateIndex][btnIndex+3] = newValue; 
				//btnIndex �� ����� : 0 �������� �� : 1 ��ư �ΰ��̹Ƿ�
				//�� index��ȣ = ����� �ε�����ȣ:3 ������ �ε��� ��ȣ:4 
			}
	

	//�����ϱ�
	boolean delete(String keyword) { //�ܺο��� �޾ƿ��� Ű����(������ Ű����)
		boolean deleteCheck = false; //flag
		
		for (int i = 0; i < cnt; i++) {
			//arrPlane[i][1] i����1���� Ű���尡 ������! �츮�� �����ϰ��� �ϴ� �����̴�
			if(arrPlane[i][1].equals(keyword)) {
				//cnt - 1 : ������ ������ ��� �� 
				//cnt : null�� ��� ��
				for (int j = i; j < cnt; j++) { //j=i j�� ���ȣ�� �����ϰڴ�
					arrPlane[j] = arrPlane[cnt+1]; //������� �о��ش�
				}
				deleteCheck = true;
				cnt--;
				break;
			}
		}
		return deleteCheck;
	}
	
	//��Ϻ���
	String show() {
		
		String result = "�װ���, �װ��� ��ȣ, �ִ�°���(��), �����, ������\n"; 
		
		for (int i = 0; i < cnt; i++) { 
			result +=  "��"; 
			for (int j = 0; j < cLength; j++) {
				result += j  == cLength-1 ? arrPlane[i][j] : arrPlane[i][j] + ",  "; 
				// arrPlane[i][j] => �� ������� �ϳ��� ��!! �Է¹��� ������ �װ���, �װ��� ��ȣ, ...�� ��µǵ���
				//���׿����ڸ� �̿��Ͽ� ������ �迭���� ���� ��ǥ ���� ���� �� �ְ� �Ѵ�
			}
			result += "\n";
		}
		if(cnt == 0) result = "��� ����"; //�Է��� ������ ���� �� ��Ϻ��� ������ ������ ����
		return result;
	}
	
	
	//�˻� ��� ����
	String show(int[] arIndex) {
		String result = "�װ���, �װ��� ��ȣ, �ִ�°���(��), �����, ������\n";
		
		for (int i = 0; i < arIndex.length; i++) { 
			result +=  "��"; //ó�� �����Ҷ��� ������ �ϱ�
			for (int j = 0; j < cLength; j++) {
				result += arrPlane[arIndex[i]][j]; //arIndex[i] ���� ���ȣ�� ����ִ�
				result += j == cLength - 1 ? "" : ",  "; //���������� ��ǥ ������ �ʰڴ�
			}
			result += "\n";
		}
		//�˻���� ���� �� ����
		if(arIndex.length==0) result = "�˻� ��� ����";
		return result; //String �˻� ����� result �� ���
	}
		
}
