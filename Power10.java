import java.util.Scanner;
public class Power10 {
	public static void powerTen(int n)
	{
		while(n>1)
		{
			if(n%10!=0)
			{
				System.out.println("false");
				System.exit(03);
			}
			else
			{
				n=n/10;
			}
		}
		System.out.println("true");
		
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int n=sc.nextInt();
	powerTen(n);
	}
	

}
