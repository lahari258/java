import java.io.*;
import java.util.*;
public class Multiplication extends Object
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first integer");
		int i1=sc.nextInt();
		System.out.print("Enter the second integer ");
		int i2=sc.nextInt();
		int i3=i1*i2;
		System.out.println("Product of "+ i1 + " and " +i2+" is " +i3);
}
}
