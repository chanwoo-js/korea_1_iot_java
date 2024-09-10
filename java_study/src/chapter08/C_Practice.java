package chapter08;

// 다형성
// Animal, Cat, Dog 클래스
// Animal 클래스 : sound 메서드 (The animal makes a sound)
// Cat, Dog 클래스 - Animal 클래스를 상속
// : sound 메서드를 오버라이딩 >> 각각 "meow", "bark" 출력

// instanceof 연산자
// : Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat'출력 / Dog > 'dog'출력 / 둘다 x > 'Unkown animal type'

class AnimalClass{
	void Sound() {
		System.out.println("The animal makes a sound");
	}
}
class CatClass extends AnimalClass{
	@Override
	void Sound() {
		System.out.println("meow");
	}
}
class DogClass extends AnimalClass{
	@Override
	void Sound() {
		System.out.println("bark");
	}
	
}
class AnimalChecker {
	void checkAnimalType(AnimalClass animal) {
		if(animal instanceof CatClass) {
			System.out.println("This is a cat");
		} else if (animal instanceof DogClass) {
			System.out.println("This is a dog");
		} else {
			System.out.println("Unkown animal type");
		}
	}
}
public class C_Practice {
	public static void main(String[] args) {
//		Animal, Cat, Dog 클래스의 객체를 Animal  타입으로 저장
//		생성된 각 객체를 checkAnimalType 메서드를 사용하여 확인
		AnimalChecker animalChecker = new AnimalChecker();
		AnimalClass myPet1 = new CatClass();
		animalChecker.checkAnimalType(myPet1);
		
		AnimalClass myPet2 = new DogClass();
		animalChecker.checkAnimalType(myPet2);
		
		AnimalClass myPet3 = new AnimalClass();
		animalChecker.checkAnimalType(myPet3);
		
	}
}