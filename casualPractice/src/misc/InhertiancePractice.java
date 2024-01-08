	package misc;
	
	class Animal//parent class also known as Super class
	{
		static int a;
		void eat()
		{
			System.out.println("I am eating.");	
		}
	}
	
	public class InhertiancePractice extends Animal //child class of Animal class
	{
		public static void main(String[] args)
		{
			InhertiancePractice ob=new InhertiancePractice();
			
			ob.eat();//we don't have to create an object of animal class because InhertiancePractice inherits the properties of Animal class
			int b=a;
		}
	}