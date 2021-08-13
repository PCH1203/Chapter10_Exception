package bit.camp.common;

public class Calculator {
	
			// [예외처리]
			// 업무적으로 i + j 값은 1000이 넘으면 에러!
			// 업무적으로 i + j 값에 음수이면 에러!
	
			//더하기 ********************************** 
			static void add(int i, int j) throws  BizNegativeNumberExcpetion, BizThousandOverException { // throws로 예외객체를 던지면 그 객체는 Exception을 상속받고 있음.
				int result = i + j;
				if(result > 1000) {
					throw new BizThousandOverException(); // 예외 클래스가 아니라 객체를 던져라!
				}
				if(result < 0) {
					throw new BizNegativeNumberExcpetion();
				}
//				return result;
				System.out.println("메소드에 println있음, 계산값: " + result);
			}		
			// [예외처리]
			// 업무적으로 i + j 값에 음수이면 에러!
			
			//빼기 ***********************************
			static int sub(int i, int j) throws BizNegativeNumberExcpetion {
				int result = i - j;
				if(result < 0) {
					throw new BizNegativeNumberExcpetion();
				}
				return result;						
			}		
			
			//[예외처리]
			// 업무적으로 j가 0이면 에러!
			//나누기 **********************************
			static int div(int i, int j) throws BizDividByZeroException {
				if(j == 0) {
					throw new BizDividByZeroException();
				}
				int result = i / j;
				return result;					
			}		
		
			//곱하기 **********************************
			static int multi(int i, int j) {
				int result = i * j;
				return result;						
			}	 

}
