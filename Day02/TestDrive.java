public class TestDrive{	
	//���α׷��� ������
	public static void main(String[] args) {
		
		//��ü (object): yeEun, sangIl, sangHoon
	
		Person yeEun = new Person(10, 163, "��", 23, "������", "A");
		
		Person sangIl = new Person(10, 173, "��", 45, "�����", "B");
		
		Person sangHoon = new Person(10, 177, "��", 32, "������", "C");

		//�������� ���� �Դ´�.
		String result1 = yeEun.eat("��");
		System.out.println(result1);
		
		
		//���Ͼ��� ħ�뿡�� �ܴ�.
		String result2 = sangIl.sleep("ħ��");
		System.out.println(result2);

		//�����̰� �������� �ȴ´�.
		sangHoon.walk("����");


		//�����̰� ��Ʈ������ �����Ѵ�.
		sangHoon.think("��Ʈ����");





	}

}