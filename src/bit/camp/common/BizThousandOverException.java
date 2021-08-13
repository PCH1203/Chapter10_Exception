package bit.camp.common;

public class BizThousandOverException extends Exception { //?? Exception을 상속하고 있네? Exception: 모든예외의 조상 클래스
	@Override
	public String toString() {
		return "결과값이 1000초과입니다. **확인 요망**";
	}
	
	@Override
		public String getMessage() {
		return "입력에러";	
		}
}
