class Parent
{
	int money = 999999;
	String car = "Porche";
	String newCar = "Rolls Royce";
	int site = 10;
	
	Parent()
	{
                System.out.println("====Parent Details====");
                System.out.println("Parent: Rs."+money);
                System.out.println("Parent Car: "+car);
                System.out.println("Parent New Car: "+newCar);
                System.out.println("Parent properties: "+site);
	}
}
class Child extends Parent
{
	int money = 10000;
	void use()
	{
		System.out.println("=====Child Details====");
		System.out.println("Money have: Rs."+money);
                System.out.println("Parent Money: Rs."+super.money);
                System.out.println("Parent Car: "+car);
                System.out.println("Parent New Car: "+newCar);
                System.out.println("Parent Site: "+site);
	}
}

class Demo3
{
	public static void main(String args[])
	{
		Child c = new Child();
		c.use();
	}
}
