class Board{
		
		int no;	//�۹�ȣ
		String title;	//����
		String content;	//����
		String name;	//�ۼ���
		String regDate;	//�ۼ���
		
		public Board(int no, String title, String content, String name, String regDate) {
			
			this.no = no;
			
			this.title = title;
			
			this.content = content;
			
			this.name = name;
			
			this.regDate = regDate;		
	}
			

		
		String levelup() {
			return this.no + " " + this.title + " " + this.content + " " + this.name + " " + this.regDate ;		
		}

		


}