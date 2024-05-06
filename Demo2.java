import java.util.Scanner;

class Dev
{
	int id, age;
	String name, desg = "Developer";
	int salary = 65000;
	Dev()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Id: ");
		id = sc.nextInt();

		System.out.println("Enter your Name: ");
		name = sc.next();

                System.out.println("Enter your Age: ");
                age = sc.nextInt();
	}
	void display()
	{
		System.out.println("My ID: "+id);
		System.out.println("My name: "+name);
                System.out.println("My age: "+age);
                System.out.println("My salary: Rs.  "+salary);
                System.out.println("My designation: "+desg);
	}
}
class Clerk
{
        int id, age;
        String name, desg = "Clerk";
        int salary = 35000;
        Clerk()
        {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your Id: ");
                id = sc.nextInt();

                System.out.println("Enter your Name: ");
                name = sc.next();

                System.out.println("Enter your Age: ");
                age = sc.nextInt();
        }
        void display()
        {
                System.out.println("My ID: "+id);
                System.out.println("My name: "+name);
                System.out.println("My age: "+age);
                System.out.println("My salary: Rs.  "+salary);
                System.out.println("My designation: "+desg);
        }
}

public class Demo2
{
	public static void main(String args[])
	{
		int ch = 0;

		do{
		System.out.println("1. Developer");
                System.out.println("2. Clerk");
                System.out.println("3. Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		ch = sc.nextInt();

		if(ch == 1)
		{
			Dev d = new Dev();
			d.display();
		}
		if(ch == 2)
		{
			Clerk c = new Clerk();
			c.display();
		}
		if(ch == 3)
		{
			System.out.println("Thank You.");
			System.exit(0);
		}
		if(ch > 3 || ch < 0)
		{
			System.out.println("Invalid Input.");
		}
		}while(ch != 3);
	}
}
