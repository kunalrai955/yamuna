class Static11
{
	static int a;
	static void m1(int a){
//static11.a by default has zero and replace 30 with 0
		a=Static11.a;
System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		m1(30);
		System.out.println(a);
System.out.println("hello");
System.out.println("hi");
	}
}
//Here 30 replaced with 0 as static variable by default 0
