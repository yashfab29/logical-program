import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int a=1,b=1,c=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		while(n>1)
		{
			
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}

	}

}
