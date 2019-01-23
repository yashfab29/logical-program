import java.util.Scanner;
public class Power5 {

public static void powerFive(int n)
{
	while(n>1)
	{
		if(n%10==5)
		{
			System.out.println("true");
			System.exit(0);
		}
		else
		{
			System.out.println("false");
			System.exit(0);
		}
	}
	
	
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
int n=sc.nextInt();
powerFive(n);
}


}
