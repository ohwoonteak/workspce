class Person {
		int headSize;	//�Ӹ�ũ��	(����)
		int height;		//Ű		(����)
		String gender;	//����		(����)
		int age;		//����		(����)
		String name;	//�̸�		(����)
		String family;	//����		(����)
		
		
		//void�� return�� ������ �޼����̴�
		//������ ( �Ӽ� �� �ʱ�ȭ )
		
		public Person(int headSize1, int height1, String gender1,
				int age1, String name1, String family1){
			
		
		//this.headSizes�� public Person(int headSize)�� ǥ���Ѵ�.
		//�׷��� class Person int headSize;���ȴ� 	
			this.headSize = headSize1;
			this.height = height1;
			this.gender = gender1;
			this.age = age1;
			this.name = name1;
			this. family = family1;

		}
		

		// ������ �Դ´� (��θ���, �������)
		String eat(String food) {
			if (food.equals("��")) {
				return this.name + "��(��) ��θ���.";}
			else {
				return this.name + "��(��) �������.";
			}
		}
		
		// ��𿡼� �ܴ� (�������, �ǰ��ϴ�)
			String sleep(String where) {
			if(where.equals("���ٴ�")){
				return this.name + "��(��) �ǰ��ϴ�.";
				}
				else{ 
					return this.name + "��(��) �������.";
				}

			}

		// ������� �ȴ´�
		void walk(String where) {
			System.out.println(this.name + "��(��)" + where + " ���� �ȴ´�.");
		}
				
		// ������ �����Ѵ�

		void think(String how){
			System.out.println(this.name + "��(��)" + how + "��(��) �����Ѵ�.");
		}	
			
}