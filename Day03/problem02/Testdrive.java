public class Testdirve	{
	
	
	//���α׷��� ������
	public static void main(String[]	args)	{
		Person sanghoon = new Person(10, 177, "��", 32, "������", "A");
	
		//��θ���.
		String result1 = sanghoon.eat("��");
		System.out.println(result1);

		//�������.
		String result2 = sanghoon.sleep("����");
		System.out.println(result2);

		//�������� �ȴ´�.
		sanghoon.walk("����");
		
		//�������� �����Ѵ�.
		sanghoon.think("������");
		
		//12
		int result3 = sanghoon.add(5, 7);
		System.out.println(result3);	


	}

}