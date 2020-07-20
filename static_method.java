//Java program to expalin the use of a static method

class Static_Method
{
	int num;
	String name;
	static String college = "GLA" ;

	static void change() //static method 
	{
		college = "kp";
	}

	Static_Method(int r , String n)
	{
		num = r ;
		name = n ;
	}

	void display() //method to display values
	{
		System.out.println(num+" "+name+" "+college);
	}
}

class Test_Static_Method
{
	public static void main(String args[])
	{
		Static_Method.change(); //calling change method
		//creating objects
		Static_Method obj1 = new Static_Method(11 , "Yash");
		Static_Method obj2 = new Static_Method(22 , "Rohit");
		Static_Method obj3 = new Static_Method(33 , "Amit");

		obj1.display();
		obj2.display();
		obj3.display();
	}
}

