package bit.camp.common;

public class Calculator {
	
			// [����ó��]
			// ���������� i + j ���� 1000�� ������ ����!
			// ���������� i + j ���� �����̸� ����!
	
			//���ϱ� ********************************** 
			static void add(int i, int j) throws  BizNegativeNumberExcpetion, BizThousandOverException { // throws�� ���ܰ�ü�� ������ �� ��ü�� Exception�� ��ӹް� ����.
				int result = i + j;
				if(result > 1000) {
					throw new BizThousandOverException(); // ���� Ŭ������ �ƴ϶� ��ü�� ������!
				}
				if(result < 0) {
					throw new BizNegativeNumberExcpetion();
				}
//				return result;
				System.out.println("�޼ҵ忡 println����, ��갪: " + result);
			}		
			// [����ó��]
			// ���������� i + j ���� �����̸� ����!
			
			//���� ***********************************
			static int sub(int i, int j) throws BizNegativeNumberExcpetion {
				int result = i - j;
				if(result < 0) {
					throw new BizNegativeNumberExcpetion();
				}
				return result;						
			}		
			
			//[����ó��]
			// ���������� j�� 0�̸� ����!
			//������ **********************************
			static int div(int i, int j) throws BizDividByZeroException {
				if(j == 0) {
					throw new BizDividByZeroException();
				}
				int result = i / j;
				return result;					
			}		
		
			//���ϱ� **********************************
			static int multi(int i, int j) {
				int result = i * j;
				return result;						
			}	 

}
