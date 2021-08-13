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
			System.out.println("예외 발생");
			System.out.println("e.toString(): " + e.toString());
			System.out.println("e.getMessage(): " + e.getMessage());
			System.out.println("e.printStackTrace(): ");
			e.printStackTrace(); // 오류가 발생한 주소 표기
				
		}catch(Exception e) {						//(Exception e)문은 제일 나중에 
			e.printStackTrace();
			System.out.println("예외발생 코드 실행!");	
		}
		
		System.out.println("프로그램 종료");
	}

	private static void method() {
	}
		
		
		
	
}
