package p11_5;

public class P11_5
{

	public static void main(String[] args)
	{

	}

}
/*
Analyze the following code:

A. The program does not compile because Test does not have a default constructor Test().
B. The program has an implicit default constructor Test(), but it cannot be compiled, because its super class does not have a default constructor. The program would compile if the constructor in the class A were removed.
C. The program would compile if a default constructor A(){ } is added to class A explicitly.
D. The program compiles, but it has a runtime error due to the conflict on the method name print.

*/

//class Test extends A
//{
//	public static void main(String[] args)
//	{
//		Test t = new Test();
//		t.print();
//	}
//}
//
//class A
//{
//	String s;
//
//	A(String s)
//	{
//		this.s = s;
//	}
//
//	public void print()
//	{
//		System.out.println(s);
//	}
//}
