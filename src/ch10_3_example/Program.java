package ch10_3_example;

public class Program {
	public static void main(String[] args)  {
		
/**
 * [����]
 * 	- ��������: ġ�������� ����(��������: ������ �� ���� ����)
 * 	- ������: ġ������(������ �ڵ�(�������� ���� ����) ��)���İ����� / ������ ������ ���� ������ �����ؾ� �ذ� �� �� �ִ�.
 * 	- ��     ��: �Է°�, ����� ����, ������ ��ġ ���( Ư�� ��Ȳ�̳� ��ġ���� ���������� �߻��ϴ� ����..)
 * 	-  
 * [���ܸ� ó���Ѵ�..?]
 * 	- ������..?
 * 	- ���..?
 * 
 * 	����) ���� ����� �� API ���
 * 		 �� API �Լ����� ���ܸ� �˾Ƽ� ó���Ѵٸ�...? / �����ڿ��� �˸��� �ʴ´ٸ� �����ϴ�.
 * 
 * 		write() { 					�������α׷�
 * 			����             �����߻�				try	
 * 			��������       ----->				write();
 * 			���Ͽ뷮    	     ����
 * 			...    throw ���� ��ü			catch
 * 										���� ó��
 * 		}
 * 
 * 
 */		try {
	lib.write();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
 		System.out.println("���α׷� ����");
	}
	
}

class lib {
	public static void write() throws InterruptedException {
		Thread.sleep(1000);  //�׻� 
	}
	
}
