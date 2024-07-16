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

public class Main {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.disp();
		
	}

}
