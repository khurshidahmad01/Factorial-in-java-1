import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		int i,n,fact=1;
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter value of n: ");
		n=sc1.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial = "+fact);
	}
}