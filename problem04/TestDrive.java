public class TestDrive {

	public static void main(String[] args)	{

		Board gildong = new Board(1, "�����Ź�帳�ϴ�.", "�ȳ��ϼ���", "ȫ�浿", "2017-12-13");
		
		Board jisung = new Board(2, "���� ��� ��Ź�����.", "�ݰ����ϴ�", "������", "2017-12-11");
		
		Board bumgen = new Board(3, "��ȸ�� ��Ź�帳�ϴ�.", "�������", "������", "2017-12-10");



		String result1 = gildong.levelup();
		System.out.println(result1);

		String result2 = jisung.levelup();
		System.out.println(result2);
		
		String result3 = bumgen.levelup();
		System.out.println(result3);
		
		}



}