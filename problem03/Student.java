class Student   {
		int sudentId;
		String name;
		int age;
		String major;
		int grade;


	public Student (int sudentId, String name, int age, String major, int grade) {

			this.sudentId = sudentId;
			
			this.name = name;
			
			this.age = age;
			
			this.major = major;
			
			this.grade = grade;

		}
			//������ � �����������Ѵ�
			void study () {
			System.out.println(this.name + "��(��)" +this. major + " " + "���θ� �Ѵ�.");

			}
			void introduce () {
			System.out.println("����" + " " +this.major + " " + this. grade + "�г⿡ ��������" + " " + this. name + "�Դϴ�" );

			

			}

}