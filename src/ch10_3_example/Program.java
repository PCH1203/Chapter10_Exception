package ch10_3_example;

public class Program {
	public static void main(String[] args)  {
		
/**
 * [오류]
 * 	- 구문오류: 치명적이지 않음(문법오류: 컴파일 시 수정 가능)
 * 	- 논리오류: 치명적임(개발자 코딩(문법적인 오류 제외) 예)수식계산오류 / 개발자 본인이 직접 문제를 인지해야 해결 할 수 있다.
 * 	- 예     외: 입력값, 입출력 관련, 물리적 장치 사용( 특정 상황이나 장치에서 예외적으로 발생하는 오류..)
 * 	-  
 * [예외를 처리한다..?]
 * 	- 무엇을..?
 * 	- 어디서..?
 * 
 * 	예시) 파일 입출력 시 API 사용
 * 		 → API 함수에서 예외를 알아서 처리한다면...? / 개발자에게 알리지 않는다면 위험하다.
 * 
 * 		write() { 					관리프로그램
 * 			권한             오류발생				try	
 * 			파일존재       ----->				write();
 * 			파일용량    	     보고
 * 			...    throw 예외 객체			catch
 * 										오류 처리
 * 		}
 * 
 * 
 */		try {
	lib.write();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 		System.out.println("프로그램 종료");
	}
	
}

class lib {
	public static void write() throws InterruptedException {
		Thread.sleep(1000);  //항상 
	}
	
}
