package Webinar;

class Animal
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog  extends Animal
{
	public void bark()
	{
		System.out.println("Dog is barking");
	}
}
public class Inheritance 
{
	public static void main(String[] args) 
	{
		Dog ob=new Dog();
		
		ob.bark();
		ob.eat();
	}

}
