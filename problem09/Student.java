class Student {
	// 인스턴스변수(Instance Variable), 멤버 변수(Member Variable)
	// 자바개발자는 인스턴스변수라고 하고 보통사람들은 멤버변수라고 한다.
	// 둘다 사용가능하다
	int studentId; // 학번
	String name;	// 이름
	int age;	// 나이
	String major;	// 전공
	int grade;	// 학년

		//틀부터 만들어준다.
		public student(int studentId, String name, int age, String major, int grade) {
			int grade {
			this.studentId = studentId;
			this.name = name;
			this.age = age;
			this.major = major;
			this.grade = grade;
				


	
		}
		
	//괄호 안에 들어가는 것들을 parameter(Argument)라고 한다.
	//메서드(Method)
	String Study() {
		return this.name + "(이)가" + this.major + "공부를 한다.";
		}

	String introduce() {
		return "저는" + this.major + " " + this.grade + "학년" + "재학중인" + this.name + "입니다.";

		}




}


