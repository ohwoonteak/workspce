public class Break{
	public static void main(String[] args){
		
		for(int i = 0; i < 10; i++){			//0~9까지 출력한다.
				System.out.print(i + " ");
			
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++){		//브레이크로인해서 0~5까지만 출력한다.
				if( i == 6){
					break;
				}
				System.out.print(i + " ");
		}
	
		
	}
	}
	
