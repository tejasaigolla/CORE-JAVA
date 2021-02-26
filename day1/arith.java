import java.util.*;
public class arith
{
	static int arithmeticOperation(int a,int b,int n)
	{
		int res;
		if(a>32767 || b>32767 || a<0 || b<0)
		{
			return -1;
		}
		else
		{
			switch(n)
			{
				case 1:
					res=a+b;
					break;
				case 2:
					res=a-b;
					break;
				case 3:
					res=a*b;
					break;
				case 4:
					res=a/b;
					break;
				default:
					return -1;
			}
		}
		return res;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		int x=arithmeticOperation(a,b,n);
		if(x==-1)
		{
			System.out.println("invalid Input");
		}
		else
		{
			System.out.println(x);
		}
	}
}
