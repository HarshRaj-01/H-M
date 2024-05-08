class A
{
	static int x = 1000;
	static void display()
	{
		System.out.println("Hi, Harsh this side.");
	}
}

class Demo6
{
	public static void main(String args[])
	{
		System.out.println(A.x);
		A.display();
	}
}
