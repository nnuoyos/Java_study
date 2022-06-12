package day19;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h); // {} body�� �����Ƿ� �տ� abstract �ٿ��ش�
	
	//�޼��忡 ���̳��� ���̸� ���� ������ �� �� ���� => �ڽ� Ŭ�������� ������x, ��븸 �϶�� ����
	final void function() {
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�");
	}
}

//�簢�� ���� ���ϱ�
class Rect extends Shape{
	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("����: "+area+"cm��");
	}
}

//�ﰢ�� ���� ���ϱ�
class Tri extends Shape{
	@Override
	void showArea(double w, double h) { //���̸� ���϶�� ������ ������!
		area = (w*h)/2;
		System.out.println("�ﰢ�� ����: "+area+"cm��");
	}
}


