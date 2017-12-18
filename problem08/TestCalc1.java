public class TestCalc{
	
	public static void main(String[] args){
		
		//객체
		Calc aaa = new Calc(); //Calc 클래스의 객체(Object)(aaa는 변수)
		
		
		
		
		int a = Integer.parseInt(args[0]);
		
		int b = Integer.parseInt(args[1]);
		
		
		
		
		
		
		
		
		
		int ada = aaa.add(a, b); //aaa.add를 int ada에 대입을한다
		System.out.println("a와 b를 더한다");
		// 결과를 출력한다.()안에들어가는게 출력값이다
		
		
		
		int adc = aaa.sub(a, b);
		System.out.println(adc);
		
		
		int add = aaa.mul(a, b);
		System.out.println(add);
		
		int ade =  aaa.div(args[0], args[1]);
		System.out.println(ade);
	
	
	
	
		
	
	}
	
}