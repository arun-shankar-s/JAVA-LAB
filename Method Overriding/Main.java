package ifsample;

class Animal {
	public void disp() {
		System.out.println("I am an animal");
	}

}

class Dog extends Animal {

	public void disp() {
		super.disp();
		System.out.println("I am a dog");
	}
}
class Cat extends Animal {

	public void disp() {
		super.disp();
		System.out.println("I am a cat");
	}
}

public class Main {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.disp();
		
		//Dog obj1=new Dog();
		//obj.disp();
	}

}
