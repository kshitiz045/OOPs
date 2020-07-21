//Java program to explain the use of this keyword

class Test
{
        int num ;
        String name ;
        float fees ;

        Test(int num , String name , float fees)
        {
                this.num = num ;
                this.name = name ;
                this.fees = fees ;
        }

        void display()
        {
                System.out.println(num+" "+name+" "+fees);
        }
}

class Test_This
{
        public static void main(String args[])
        {
                Test obj1 = new Test(11 , "Yash" , 200000f);
                Test obj2 = new Test(22 , "Rohit" , 300000f);
                obj1.display();
                obj2.display();
        }
}
