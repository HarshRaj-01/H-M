class Bank
{
	public int roi() {return 12;}
}
class HDFC extends Bank
{
	public int roi()
	{
		return 13;
	}
}
class Axis extends Bank
{
}
class Demo5
{
	public static void main(String args[])
	{
		HDFC h = new HDFC();
		System.out.println("HDFC Bank ROI: "+h.roi());
		Axis a = new Axis();
		System.out.println("Axis Bank ROI:"+a.roi());
	}
}
