import java.util.Scanner;
public class Power2 {
public static void powerTwo(int n)
{
	while(n>1)
	{
		if(n%2!=0)
		{
			System.out.println("false");
			System.exit(0);
		}
		else
		{
			n=n/2;
		}
	}
	System.out.println("true");
	
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
powerTwo(n);
}


}
