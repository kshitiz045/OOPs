//Java program to explain the single inheritance

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

class Single_Inheritance
{
	public static void main(String args[])
	{
		Dog obj = new Dog();
		obj.bark();
		obj.eat();
	}
}
