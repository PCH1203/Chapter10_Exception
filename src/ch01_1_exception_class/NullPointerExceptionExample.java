package ch01_1_exception_class;
class Person{}

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		
		String data1;
		String data2 = null;
		String data3 = "";
		String data4 = " ";

		method();
		
		try {
			System.out.println(data2.length());
			
		
		}catch (NullPointerException e) {
			System.out.println("���� �߻�");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace(); // ������ �߻��� �ּ� ǥ��
				
		}catch(Exception e) {						//(Exception e)���� ���� ���߿� 
			e.printStackTrace();
			System.out.println("���ܹ߻� �ڵ� ����!");	
		}
		
		System.out.println("���α׷� ����");
	}

	private static void method() {
	}
		
		
		
	
}
