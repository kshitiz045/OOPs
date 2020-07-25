//Java program to explain the concept of final class

final class Bike{}

class Final_Class extends Bike
{
      void run()
      {
           System.out.println("running safely with 100kmph");
      }
      public static void main(String args[])
      {
      	    Final_Class obj = new Final_Class();
            obj.run();
      }
}
