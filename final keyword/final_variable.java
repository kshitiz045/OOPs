//Java program to explain the concept of final variable

class Final_Variable
{
     final int speedlimit=90;//final variable
     void run()
     {
     	speedlimit=400;
     }
     public static void main(String args[]){
     Final_Variable obj = new Final_Variable();
     obj.run();
     }
}
