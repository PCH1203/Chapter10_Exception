package ch10_3_example;

public class BizNegativeNumberExcpetion extends Exception {
	
	@Override
	public String toString() {
		return "������� �����Դϴ�. **Ȯ�� ���**";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

}