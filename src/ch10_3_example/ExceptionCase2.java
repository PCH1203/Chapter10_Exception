package ch10_3_example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase2 {
	public static void main(String[] args) {
		// �� ������ ����ڷκ��� �Է� �ޱ� ��) 3,4 3/4 ������ �����ϰ�
//		// �Է¹��� ���ڿ� ������ ����� ����Ͻÿ�

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
		
		if(Double.isInfinite(d1/d2)) {  // d1/d2�� infinite(���Ѵ�)���?
			throw new ArithmeticException();
			}
		
			System.out.printf("%f / %f = %f\n", d1, d2, d1/d2);			
		
		}catch(InputMismatchException e) {
			System.out.println("���� ����������");
		}catch(ArithmeticException e) {
			System.out.println("0����������");
		}finally {
			System.out.println("���α׷� ����");
		}
	}
}




