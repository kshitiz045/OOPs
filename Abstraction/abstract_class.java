//Java program to explain the concept of abstract class

abstract class Bank
{
        abstract int getRateOfInterest();
}
class SBI extends Bank
{
        int getRateOfInterest()
        {
                return 7;
        }
}
class PNB extends Bank
{
        int getRateOfInterest()
        {
                return 8;
        }
}
class Abstract_Class
{
        public static void main(String args[])
        {
                Bank obj;
                obj=new SBI();
                System.out.println("Rate of Interest is: "+obj.getRateOfInterest()+" %");
                obj=new PNB();
                System.out.println("Rate of Interest is: "+obj.getRateOfInterest()+" %");
        }
}



          
