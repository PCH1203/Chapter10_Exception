package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
		
		// 객체 생성 없이 Calculator.add 형식으로 사용하려면 add메소드를 static키워드로 선언해야 한다.
		
 {
			try {
				
			Calculator.add(1999, -2); // result가 1000넘으면 에러남.			
			
		} catch (BizNegativeNumberExcpetion e) {
			System.out.println(e.toString());
//			
		} catch (BizThousandOverException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
//			System.out.println("결과값이 1000초과입니다. **확인 요망**");			
		} 
		// 무조건 마지막에 모두 들리는곳.
		finally {
			System.out.println("입격값을 확인하세요~");
		}
		
//		Calculator.sub(5,3);
//		
//		System.out.println("sub메소드에서 리턴 된 값 호출 계산값: " + Calculator.sub(5,3)); //sub메소드에 리턴된 값을 출력
//		
//		Calculator.multi(1,3);
//		
//		Calculator.div(1,1);	
		
		System.out.println("프로그램 정상 종료");
	}		
	}
}

