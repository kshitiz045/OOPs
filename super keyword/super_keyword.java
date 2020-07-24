// Java program to explain the topic of super keyword

class Animal
{
    String color="white";
}

class Dog extends Animal
{
    String color="black";
    void printColor()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}

class Test_Super
{
    public static void main(String args[])
    {
         Dog obj  =new Dog();
         obj.printColor();
    }
} 

