package ch10_3_example;

public class ExceptionExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
		
		// ��ü ���� ���� Calculator.add �������� ����Ϸ��� add�޼ҵ带 staticŰ����� �����ؾ� �Ѵ�.
		
 {
			try {
				
			Calculator.add(1999, -2); // result�� 1000������ ������.			
			
		} catch (BizNegativeNumberExcpetion e) {
			System.out.println(e.toString());
//			
		} catch (BizThousandOverException e) {
			System.out.println(e.toString());
			System.out.println(e.getMessage());
//			System.out.println("������� 1000�ʰ��Դϴ�. **Ȯ�� ���**");			
		} 
		// ������ �������� ��� �鸮�°�.
		finally {
			System.out.println("�԰ݰ��� Ȯ���ϼ���~");
		}
		
//		Calculator.sub(5,3);
//		
//		System.out.println("sub�޼ҵ忡�� ���� �� �� ȣ�� ��갪: " + Calculator.sub(5,3)); //sub�޼ҵ忡 ���ϵ� ���� ���
//		
//		Calculator.multi(1,3);
//		
//		Calculator.div(1,1);	
		
		System.out.println("���α׷� ���� ����");
	}		
	}
}

