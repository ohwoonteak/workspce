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
			//누구는 어떤 전공을공부한다
			void study () {
			System.out.println(this.name + "은(는)" +this. major + " " + "공부를 한다.");

			}
			void introduce () {
			System.out.println("저는" + " " +this.major + " " + this. grade + "학년에 재학중인" + " " + this. name + "입니다" );

			

			}

}