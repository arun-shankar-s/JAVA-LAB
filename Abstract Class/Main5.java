package ifsample;

abstract class Animal2 {
	public abstract void makeSound();
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Dog2 extends Animal2 {

	public void makeSound() {
		System.out.println("Dog Barks");
	}
}
public class Main5 {

	public static void main(String[] args) {
		Dog2 obj=new Dog2();
		obj.makeSound();
		obj.sleep();

	}

}
