package day16;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest(); 
		//��üȭ
		//VariableTest(Ŭ����: �߻��� ����)�� ��üȭ ��Ű�� ��ü: vt
		vt.f();
		vt.f();
		vt.f();
		vt.f2();
		vt = new VariableTest(); //new�� ���� �ٽ� �ʱ�ȭ �ȴ�
		vt.f(); //data�� �ʱⰪ 0���� ���´�
	}
}
