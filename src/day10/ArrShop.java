package day10;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ArrShop {
	//����Ű
	//������ ȫ���� ����
	//����, Ű��
	//������a, ȫ����a, ������a 
	//������k, ȫ����k, ������k
	
	public static void main(String[] args) {
		int [][] arrIncome = new int [2][3];
		int [] arASum=new int [2]; //Ű��/���� ���ɺ� �� �����
		int [] arBSum= new int [3];  //����,ȫ��,����  ������ �� �����
		int sum=0;
		double [] aAvg= new double[2]; //��� 2�� ���� => �迭�� �����
		double [] bAvg= new double[3];
		double Avg=0.0;
		int rLength = arrIncome.length; //���� ����
		int cLength = arrIncome[0].length; //���� ����
		
		String result="";
		String[][] arrName= {
				{"������A","ȫ����A","������A"},
				{"������K","ȫ����K","������K"}
		};
		/*
		A / 3 adult ������� ��� 
		K / 3 kids ������� ���
		*/
		
		String [] arAName = {"����","Ű��"};
		String [] arBName = {"������","ȫ����","������"};
		String inputMsg="������� �Է��ϼ���";
		
		for(int i=0; i<rLength; i++) { //���ڷ� ���� �Ǹ� ���� ������ �������Ƿ� �迭 ���̸� �־��ش�
			for(int j=0; j<cLength; j++) { 
				arrIncome[i][j]=Integer.parseInt(JOptionPane.showInputDialog(arrName[i][j]+" "+inputMsg));
				arASum[i] += arrIncome[i][j]; //���ɺ� �����
				//�ݺ��� ����: i �� 0�϶�, 0��° �濡 ������A �� ������� ��
				//�� ���� j�� 1�� �ǰ� ȫ����A �����, j=2 ������A�� ���ʴ�� ��
				arBSum[j] += arrIncome[i][j]; //������ ����� 
				sum+=arrIncome[i][j]; //�Ѹ����
			}
		}
		for(int i=0; i<aAvg.length; i++) {
			aAvg[i]=Double.parseDouble(String.format("%.2f",(double)arASum[i] / arBSum.length)); //���ɺ� ���
		}
		for(int i=0; i<bAvg.length; i++) {
			bAvg[i]=Double.parseDouble(String.format("%.2f",(double)arBSum[i] / arASum.length)); //���ɺ� ���
		}
		
		Avg = Double.parseDouble(String.format("%.2f", (double)sum / (rLength*cLength))); //�հ踦 �� �������ŭ �����ش�
		
		for(int i=0; i<rLength; i++) {
			for(int j=0; j<cLength; j++) {
				result += arrName[i][j]+"�����: " + arrIncome[i][j] + "����\n"; //���θ����� ����
			}
			//���ɺ� �����
			result += arAName[i] + "�� �����: " + arASum[i] + "����\n";
			result += arAName[i] + "��� �����: " + aAvg[i] + "����\n";
		}
		
		for(int i=0; i<arBSum.length; i++) {
			result += arBName[i]+ "�� �����: " + arBSum[i]+ "����\n";
			result += arBName[i]+ "��� �����: " + bAvg[i]+ "����\n";
		}
		result += "�� �����: " + sum + "����\n";
		result += "��� �����: " + Avg + "����\n";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
