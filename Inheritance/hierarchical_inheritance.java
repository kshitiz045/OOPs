//Java program to explain the hierarchical inheritance

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class Cat extends Animal
{
	void meow()
	{
		System.out.println("Meowing");
	}
}

class Hierarchical_Inheritance
{
	public static void main(String args[])
	{
		Cat obj = new Cat();
		obj.meow();
		obj.eat();
	}
}
