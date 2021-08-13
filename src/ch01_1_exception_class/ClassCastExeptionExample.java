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
		Dog dog = (Dog) animal; // ClassCastException 발생 가능
		System.out.println("Dog타입으로 형변환 완료");
	   }else	{
		   System.out.println("Dog타입으로 형번환 불가");
	   }
		
		
	}
}



