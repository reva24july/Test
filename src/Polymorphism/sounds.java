package Polymorphism;

public class sounds {

	public static void main(String[] args) {
	//*method overriding-parent class and child class have same method..based on the object created method got invoked.\\
		//**called as run time polymorphism//
	Animal a=new Animal();
	a.Animalsound();
	Pig p=new Pig();
	p.Animalsound();
	Cat c=new Cat();
	c.Animalsound();

	}

}
