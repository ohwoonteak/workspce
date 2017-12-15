public class TestPuppy{
	
	public static void main(String[] args){
		
		Puppy mongmong = new Puppy("말티즈", "기쁨이", 7, "남");
		Puppy mangmang = new Puppy("요크셔테리어", "몽실이", 4, "여");
		Puppy dingding = new Puppy("말티즈", "기쁨이", 8, "여");
		
		boolean isEquar1 = mongmong.equals(mangmang);
			System.out.println(isEquar1);
			
		boolean isEquar2 = dingding.equals(mongmong);
			System.out.println(isEquar2);
		
		
	}
	
	
}