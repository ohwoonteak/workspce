class Person{                        //����� ǥ���ϴ� �ϳ��� ��
		//�Ӽ�
	int  headSize;	//�Ӹ�ũ��(����)
	int  height;	//Ű	  (����)
	String gender;	//����	  (����)
	int  age;	//����	  (����)
	String name;	//�̸�	  (����)
	String family;	//����	  (����)


		//������(Constructor) (Ŭ������ �Ӽ� ������ �ʱ�ȭ)
		public Person(int headSize, int height,	String gender,	int age, String name String family)	{
				
				this.headSize = headSize;
				this.height = height;
				this.gender = gender;
				this.age = age;
				this.name = name;
				this.family = family;
			}	
		



		
		// �޼���(Method)
		// ������ �Դ´� (��θ���, �������) food ������ ������� ���� ��  String
		String eat(String food)	{
			if(food.equals("��"))	{
				return "��θ���.";
		}
			else{
				return "�������.";
		}
		
	}	
		//
		// ��𿡼� �ܴ� (�������, �ǰ��ϴ�)
		String sleep(String where)	{
			if (where.equals("���ٴ�"))
			return "�ǰ��ϴ�";
				
			}
			else {
				return "�������";
			}
	

		//return�ҰԾ����� void�� ä���־��ش�
		// ������� �ȴ´�
		void walk(String where)	{
			System.out.println(where + "���� �ȴ´�");
				
	}
		
		// ������ �����Ѵ�

		void think(String how)	{
			System.out.println(how	+  "��(��) �������Ѵ�");

	}
		//�μ��� ���� ���ϴ� �޼���
		//���� a�� ����b�� ���ϴ� �޼���
		int add(int a, int b)	{
			return a + b;
		}

}


}