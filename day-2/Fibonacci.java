//Fibonacci number
import java.util.*;
class Fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<n;i++)
		{
			System.out.println(a+" ");
			int c=a+b;
			a=b;
			b=c;
			
		}
		sc.close();
	}
}



        