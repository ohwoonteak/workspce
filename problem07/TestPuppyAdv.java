public class TestPuppyAdv{
	
	public static void main(String[] args){
		
		PuppyAdv mongmong = new PuppyAdv("말티즈", "기쁨이", 7, "남");
		PuppyAdv mangmang = new PuppyAdv("요크셔테리어", "몽실이", 4, "여");
		PuppyAdv dingding = new PuppyAdv("말티즈", "기쁨이", 8, "여");
		
		boolean isEquar1 = mongmong.equals(mangmang);
			System.out.println(isEquar1);
			
		boolean isEquar2 = dingding.equals(mongmong);
			System.out.println(isEquar2);
		
		
	}
	
	
}