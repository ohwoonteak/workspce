class Board{
		//인스턴스 변수
		int no;
		String title;
		String content;
		String name;
		String regDate;
		//생성자
		public Board(int no, String title, String content, String name, String regDate) {
			
			this.no = no;
			
			this.title = title;
			
			this.content = content;
			
			this.name = name;
			
			this.regDate = regDate;		
	}
			

		//출력하는것
		String printBoard() {
			return this.no + " " + this.title + " " + this.content + " " + this.name + " " + this.regDate ;		
		}
}