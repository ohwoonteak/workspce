class PuppyAdv{
	String type;	//종류
	String name;	//이름
	int age;		//나이
	String gender;  //성별
	
		public PuppyAdv(String type, String name, int age, String gender){

		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		}
		// 연산자 우선순위
		// 0. &&: 논리곱 두개다 만족해야만 true
		// 0. ||: 논리합 하나만 만족해도 true
		// 1. + - * /
		// 2. == > && > 
		// 비교 메서드 만들기
		boolean equals(PuppyAdv p){
			
			if(this.type == p.type && this.name == p.name){
				return true;
			}
					return false;
		}
}
