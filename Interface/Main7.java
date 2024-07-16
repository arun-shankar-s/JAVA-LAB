package ifsample;

interface Animal3{
	void makeSound();
}

class Dog4 implements Animal3{
	public void makeSound() {
        System.out.println("Dog barks");
    }
}
public class Main7 {

	public static void main(String[] args) {
		Dog4 obj=new Dog4();
		obj.makeSound();
		

	}

}
