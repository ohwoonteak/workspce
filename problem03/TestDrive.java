public class TestDrive{


		//프로그램의 시작점
		public static void main(String[] args)	{

		Student heaJung = new Student(11, "김혜정", 26, "무용학과", 2);
		
		Student soYeng = new Student(13, "박소영", 24, "항공과", 1);
		
		Student woonTaek = new Student(11, "오운택", 26, "사회체육학과", 2);

		
		//결과를 적는다
		//혜정이는 무용학과 공부를한다
		heaJung.study();
		
		heaJung.introduce();
		
		soYeng.study();
		
		soYeng.introduce();
		
		woonTaek.study();
		
		woonTaek.introduce();
		}
}



