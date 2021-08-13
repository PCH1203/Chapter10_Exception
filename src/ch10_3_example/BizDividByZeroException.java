package ch10_3_example;

public class BizDividByZeroException extends Exception {
	
	@Override
	public String toString() {
		return "0으로 분자를 나눌 수 없잖니";
	}

}
