class Student {
	// �ν��Ͻ�����(Instance Variable), ��� ����(Member Variable)
	// �ڹٰ����ڴ� �ν��Ͻ�������� �ϰ� ���������� ���������� �Ѵ�.
	// �Ѵ� ��밡���ϴ�
	int studentId; // �й�
	String name;	// �̸�
	int age;	// ����
	String major;	// ����
	int grade;	// �г�

		//Ʋ���� ������ش�.
		public student(int studentId, String name, int age, String major, int grade) {
			int grade {
			this.studentId = studentId;
			this.name = name;
			this.age = age;
			this.major = major;
			this.grade = grade;
				


	
		}
		
	//��ȣ �ȿ� ���� �͵��� parameter(Argument)��� �Ѵ�.
	//�޼���(Method)
	String Study() {
		return this.name + "(��)��" + this.major + "���θ� �Ѵ�.";
		}

	String introduce() {
		return "����" + this.major + " " + this.grade + "�г�" + "��������" + this.name + "�Դϴ�.";

		}




}


