class Puppy{
	String type;	//종류
	String name;	//이름
	int age;		//나이
	String gender;  //성별
	
		public Puppy(String type, String name, int age, String gender){

		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		}
		boolean equals(Puppy p){
			
			if(this.type == p.type){
			
				if(this.name == p.name)			
					return true;
			
			}
		
			return false;
		}
}
