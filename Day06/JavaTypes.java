public class JavaTypes{
	
	public static void main(String[] args){
		
		//분류 			자료형			상수
		//정수형		byte			-128 ~ 127
		//정수형		short			-32,768 ~ 32,767
		//정수형		int(기본형)		10진수,8진수,16진수(-2,147,483,648 ~ 2,147,483,647)
		//정수형		long			32000L (숫자 뒤에 L을 붙임)(-2^63 ~ 2^63-1)
		//실수형		float			(+,-)1.4E-45 ~ 3.4028235E38(숫자 뒤에 F를 붙임)
		//실수형		double(기본형)	(+,-)4.9E-324 ~ 1.7976931348623157E308
		//문자열		String			큰 따옴표로 표기
		//문자			char			작은 따옴표로 한글자만 표기
		//부울			boolean			true, false 두가지만 들어간다.
		
			//정수형
			int intvalue = 0;
			int num01 = 10;			//10진수 10을 표기
			int num02 = 010;		//8진수 8을 표기
			int num03 = 0x10;		//16진수 16을 표기
			byte bnum01 = -128;
			short snum01 = -32768;
			long lnum01 = -2147483648L;
			System.out.println(intvalue);
			System.out.println(num01);
			System.out.println(num02);
			System.out.println(num03);
			System.out.println(bnum01);
			System.out.println(snum01);
			System.out.println(lnum01);
	
			//실수형
			float floatval = 3.14F;
			double doubleval = 256.12;
			System.out.println(floatval);
			System.out.println(doubleval);
			
			
			//문자형
			String stringvalue = "안녕하세요.";
			String bye = "안녕히 계세요.";
			System.out.println(stringvalue);
			System.out.println(bye);
			
			//문자
			char charval = 'A';
			System.out.println(charval);
			
			//부울
			boolean trueval = true;
			boolean falseval = false;
			System.out.println("" + trueval + 10);
			System.out.println(falseval);
			boolean result = 1 == 2;
			boolean result2 = 1 != 2;
			System.out.println(result);
			System.out.println(result2);
			
			boolean isEqualnumber = 10 == 11;
			boolean isEqualType = "살살개" == "삽살개";
			boolean isEqualname = "해피" == "누렁이";
			if(isEqualnumber && isEqualType && isEqualname){
				
			}
			//형변환
			byte byteRes = (byte)129;		//int형을 강제로 byte 타입으로 변환
			System.out.println(byteRes);
			short shortRes = (short)32768;	//int형을 강제로 short 타입으로 변환
			System.out.println(shortRes);
			
			float floatval01 = 12.34F;
			int intval01 = (int)floatval01; 		//float 타입이 int 타입으로 변환
			System.out.println(intval01);
			
			int charnum = 'A';	//char 타입을 int형으로 변환
			System.out.println(charnum);
	}
	
	
}