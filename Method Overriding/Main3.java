package ifsample;

class Animal1 {
	public void disp(String sound) {
		System.out.println("Animals make "+sound);
	}

}

class Dog1 extends Animal1 {

	public void disp(String sound1) {
		System.out.println("I "+sound1);
	}
}
class Cat1 extends Animal1 {

	public void disp(String sound2) {
		System.out.println("I "+sound2);
	}
}
public class Main3 {

	public static void main(String[] args) {
		
		Cat1 obj=new Cat1();
		Animal1 obj1=new Animal1();
		obj1.disp("Generic Sound");
		obj.disp("meows");
		
		//Dog obj1=new Dog();
		//obj.disp("bark");
	}

}
