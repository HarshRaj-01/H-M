import java.util.Scanner;

class Emp
{
	int id, age;
	String name, desg;
	int salary;
	Emp()
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
	void raise()
	{
		salary += (salary*0.1);
	}
}
class Manager extends Emp
{
        Manager()
	{
		salary = 4500000;
		desg = "Manager"; 
	}
}
class Dev extends Emp
{
	Dev()
	{
		salary = 1500000;
		desg = "Developer";
	}
}

class Tester extends Emp
{
	Tester()	
	{
	salary = 300000;
        desg = "Tester";
	}
}

public class Demo2
{
	public static void main(String args[])
	{
		int ch,dh = 0;
		
		Tester t = null;
		do{
		System.out.println("1. Create");
                System.out.println("2. Display");
                System.out.println("3. Salary Raise");
		System.out.println("4.Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		ch = sc.nextInt();

		if(ch == 1)
		{
			do{
				System.out.println("1. Developer");
                		System.out.println("2. Manager");
                		System.out.println("3. Tester");
                		System.out.println("4.Exit");
				
				System.out.println("Enter the choice: ");
				dh = sc.nextInt();

				if(dh == 1)
				{
					Dev d = new Dev();
				}
 				if(dh == 2)
                                {       
                                        Manager d = new Manager();
                                }
 				if(dh == 3)
                                {       
                                        t = new Tester();
                                }
			}while(dh != 4);
		}
		if(ch == 2)
		{
			t.display();
		}
		if(ch == 3)
		{
			System.out.println("Raise Salary: ");
			t.raise();
		}
		if(ch == 4)
		{
			System.out.println("Thank You.");
			System.exit(0);
		}
		if(ch > 4 || ch < 0)
		{
			System.out.println("Invalid Input.");
		}
		}while(ch != 4);
	}
}
