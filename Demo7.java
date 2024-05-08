abstract class Bank
{
	abstract void ATM();
	abstract void KYC();
}

class HDFC extends Bank
{
	void ATM()
	{
		System.out.println("500000");
	}
	void KYC()
	{
		System.out.println("KYC required");
	}
}
class AXIS extends Bank
{
        void ATM()
        {
                System.out.println("500000");
        }
        void KYC()
        {
                System.out.println("KYC required");
        }
}

class Demo7
{
	public static void main(String args[])
	{
		HDFC h = new HDFC();
		h.ATM();
		h.KYC();
	}
}
