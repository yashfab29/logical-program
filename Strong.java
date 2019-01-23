import java.util.Scanner;
public class Strong {
	public static void strongN(int n)
	{
		int temp,f,a,sum=0;
		temp=n;
		while(n>0)
		{
			a=n%10;
			f=fact(a);
			sum=sum+f;
			n=n/10;
		}
		if(sum==temp)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}
	public static int fact(int f)
	{
		int n=1;
		for(int i=1;i<=f;i++)
			n=n*i;
		return n;
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		strongN(n);
	}

}
