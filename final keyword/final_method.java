//Java program to explain the concept of final method

class Bike
{
    final void run()
    {
	System.out.println("running");
    }
}

class Final_Method extends Bike
{
    void run()
    {
	System.out.println("running safely with 100kmph");
    }
    public static void main(String args[])
    {
       Final_Method obj = new Final_Method();
       obj.run();
     }
}
