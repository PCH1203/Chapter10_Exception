package bit.camp.common;

public class BizNegativeNumberExcpetion extends Exception {
	
	@Override
	public String toString() {
		return "결과값이 음수입니다. **확인 요망**";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}
