package ch01_1_exception_class;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExeptionExample {
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); 
	}
	
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
		Dog dog = (Dog) animal; // ClassCastException �߻� ����
		System.out.println("DogŸ������ ����ȯ �Ϸ�");
	   }else	{
		   System.out.println("DogŸ������ ����ȯ �Ұ�");
	   }
		
		
	}
}



