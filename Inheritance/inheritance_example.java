//Java program to explain the topic of Inheritance

class Person
{
        int salary = 50000 ;
}

class Boss extends Person
{
        int bonus = 10000 ;
        public static void main(String args[])
        {
                Boss obj = new Boss();
                System.out.println("Person salary is :" + obj.salary);
                System.out.println("Bonus of Boss is :" + obj.bonus);
        }
}




