package marker;

/*
Phone �������̽�(�߻�Ŭ����) ������ ��� �ڵ����� ����ϴ� ��� ����
Phone2G, Phone3G, Phone4G�� �����Ѵ�
User Ŭ�������� 3���� ���� ����غ���
*/
public interface Phone {
	void msg(String str, String tel);
	void call(String tel);
	void userInternet();
	
}
