package ch10_3_example;

public class BizThousandOverException extends Exception { //?? Exception�� ����ϰ� �ֳ�? Exception: ��翹���� ���� Ŭ����
	@Override
	public String toString() {
		return "������� 1000�ʰ��Դϴ�. **Ȯ�� ���**";
	}
	
	@Override
		public String getMessage() {
		return "�Է¿���";	
		}
}
