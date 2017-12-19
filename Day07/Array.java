public class Array{
	//Array는 배열
	public static void main(String[] args){
		String mon = "월";
		String tue = "화";
		String wed = "수";
		String thr = "목";
		String fri = "금";
		String sat = "토";
		String sun = "일";
		
		System.out.print(mon);
		System.out.print(tue);
		System.out.print(wed);
		System.out.print(thr);
		System.out.print(fri);
		System.out.print(sat);
		System.out.print(sun);
		
		
		System.out.println();
		
		
		//배열 (Array) 대괄호는 배열을 뜻한다.
		//.은 접근한다라는 뜻  length는 배열의 길이를 뜻한다.
		//정적 배열
		String[] weeks = {"월", "화", "수", "목", "금", "토", "일"};
		for (int i = 0; i < weeks.length; i++){
			System.out.print(weeks[i]);
			
		}
		System.out.println();
		//동적 배열
		String[] fruit = new String[4];
		fruit[0] = "사과";
		fruit[1] = "딸기";
		fruit[2] = "포도";
		fruit[3] = "바나나";
		for(int i = 0; i < fruit.length; i++){
			System.out.println(fruit[i]);
		}
		
		
		//2차원 배열
		//정적 배열 방식
		String[][] person = {{"홍길동","서울","남"},{"홍길순","부산","여"}};
		String result1 = person[0][0]; 	//홍길동
		String result2 = person[0][1];	//서울
		String result3 = person[1][2];	//여자
		//Person[] p = new Person[3];
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println();
		
		for(int i = 0; i < person.length; i++){
			for(int j = 0; j < person[i].length; j++){
				System.out.println(person[i][j]);
			}
		}
		System.out.println();
		//동적 배열 방식 (과일 - 이름, 개수, 맛)
		String[][] fruitArray = new String[3][4];
		fruitArray[0][0] = "귤";
		fruitArray[0][1] = "상";
		fruitArray[0][2] = "30개";
		fruitArray[0][3] = "상큼하다";
		
		fruitArray[1][0] = "감";
		fruitArray[1][1] = "중";
		fruitArray[1][2] = "20개";
		fruitArray[1][3] = "달콤하다";
		
		fruitArray[2][0] = "낑깡";
		fruitArray[2][1] = "상";
		fruitArray[2][2] = "50개";
		fruitArray[2][3] = "시큼하다";
		
		for(int i = 0; i < fruitArray.length; i++){
			for(int j = 0; j < fruitArray[i].length; j++){
				if( j == 0 ){
				System.out.println("이름:" + fruitArray[i][j]);}
				if( j == 1 ){
				System.out.println("품질:" + fruitArray[i][j]);}
				if( j == 2 ){
				System.out.println("개수:" + fruitArray[i][j]);}
				if( j == 3 ){
				System.out.println("맛:" + fruitArray[i][j]);}
			
			}
		}
		
		//위 2차원 배열을 for,if 문을 이용하여 출력하세요.	
		//출력 형식:
		//이름: 귤
		//품질:상
		//개수:10
		//맛:상큼하다
		
			//이렇게도 사용이 가능하다.
			
			//if (j == 0){
				//System.out.println("이름:" + fruitArray[i][j]);}
			//else if ( j == 1){
				//System.out.println("품질:" + fruitArray[i][j]);}
			//else if ( j == 2){
				//System.out.println("개수:" + fruitArray[i][j]);}
			//else if ( j == 3){
				//System.out.println("맛:" + fruitArray[i][j]);}
			
			//이렇게도 사용이 가능하다.
			
			//if (j == 0){
				//System.out.println("이름:");
			//else if ( j == 1){
				//System.out.println("품질:");
			//else if ( j == 2){
				//System.out.println("개수:");
			//else if ( j == 3){
				//System.out.println("맛:");}
			
			//System.out.println(fruitArray[i][j]);
	}
		}
			
			
			
			
			
			
			
			
			
			
			
			
