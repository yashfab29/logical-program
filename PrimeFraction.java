import java.util.Scanner;
public class PrimeFraction {
	public static void primeF(int n)
	{
		int i;
		for(i=2;i<n;i++)
		{	
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
		}
		if(n>2)
			System.out.println(n);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeF(n);

}
}
