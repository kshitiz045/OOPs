//Example of constructor in java

class Constructor_Example
{
        int age;
        String name;

        Constructor_Example() //Default Constructor
        {
                this.name = "yash";
                this.age = 22;
        }

        Constructor_Example(String n,int a) //Parameterized Constructor
        {
                this.name = n;
                this.age = a;
        }


        public static void main(String args[])
        {
                Constructor_Example obj1 = new Constructor_Example();
                Constructor_Example obj2 = new Constructor_Example("Rohit",20);
                System.out.println(obj1.name+" "+obj1.age);
                System.out.println(obj2.name+" "+obj2.age);
        }
}



