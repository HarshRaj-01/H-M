class A
{
	A()
	{
		System.out.println("A()");
	}

        A(int x)
        {
                System.out.println("A(int x)");
        }

        A(int x, int y)
        {
                System.out.println("A(int x, int y)");
        }

        A(String s, int x)
        {
                System.out.println("A(String s, int x)");
        }
}

class Demo4
{
	public static void main(String args[])
	{
		A a = new A();
		A b = new A(3, 4);		
	}
}
