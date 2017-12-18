class Person {
		int headSize;	//머리크기	(숫자)
		int height;		//키		(숫자)
		String gender;	//성별		(문자)
		int age;		//나이		(숫자)
		String name;	//이름		(문자)
		String family;	//가족		(문자)
		
		
		//void나 return이 없으면 메서드이다
		//생성자 ( 속성 값 초기화 )
		
		public Person(int headSize1, int height1, String gender1,
				int age1, String name1, String family1){
			
		
		//this.headSizes는 public Person(int headSize)를 표현한다.
		//그러면 class Person int headSize;가된다 	
			this.headSize = headSize1;
			this.height = height1;
			this.gender = gender1;
			this.age = age1;
			this.name = name1;
			this. family = family1;

		}
		

		// 무엇을 먹는다 (배부르다, 배고프다)
		String eat(String food) {
			if (food.equals("빵")) {
				return this.name + "은(는) 배부르다.";}
			else {
				return this.name + "은(는) 배고프다.";
			}
		}
		
		// 어디에서 잔다 (꿀잠잤다, 피곤하다)
			String sleep(String where) {
			if(where.equals("땅바닥")){
				return this.name + "은(는) 피곤하다.";
				}
				else{ 
					return this.name + "은(는) 꿀잠잤다.";
				}

			}

		// 어디위로 걷는다
		void walk(String where) {
			System.out.println(this.name + "은(는)" + where + " 위로 걷는다.");
		}
				
		// 무엇을 생각한다

		void think(String how){
			System.out.println(this.name + "은(는)" + how + "을(를) 생각한다.");
		}	
			
}