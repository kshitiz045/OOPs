//Java Program to explain the use of static variable
class Static_Variable
{
        int num;
        String name;
        static String college = "GLA"; // static variable

        Static_Variable(int r  , String n)
        {
                num = r ;
                name = n ;
        }

        void display()
        {
                System.out.println(num+" "+name+" "+college);
        }
}

class Test_Static
{
        public static void main(String args[])
        {
                Static_Variable obj1 = new Static_Variable(11 , "Yash");
                Static_Variable obj2 = new Static_Variable(12 , "Rohit");

                obj1.display();
                obj2.display();
        }
}



