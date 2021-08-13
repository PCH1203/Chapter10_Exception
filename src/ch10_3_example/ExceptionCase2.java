package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase2 {
	public static void main(String[] args) {
		// 두 정수를 사용자로부터 입력 받기 예) 3,4 3/4 나누기 실행하고
//		// 입력받은 숫자와 나누기 결과를 출력하시오

//		System.out.println(1/0.0);
//		System.out.println(1%0.0);
//		
		Scanner sc = new Scanner(System.in);
//		
		try {
		System.out.print("a/b... a?>");		
		double d1 = sc.nextDouble();		
		System.out.print("a/b... b?>");
		double d2 = sc.nextDouble();
		
		if(Double.isInfinite(d1/d2)) {  // d1/d2가 infinite(무한대)라면?
			throw new ArithmeticException();
			}
		
			System.out.printf("%f / %f = %f\n", d1, d2, d1/d2);			
		
		}catch(InputMismatchException e) {
			System.out.println("문자 넣지마세요");
		}catch(ArithmeticException e) {
			System.out.println("0넣지마세요");
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}




