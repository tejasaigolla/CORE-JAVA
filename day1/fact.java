import java.util.*;
import java.lang.*;
public class FactorialEx
{
    static void factorial(int n)
    {
        int res;
        int r;
        int c=0;
	int n1=Math.abs(n);
        int a[]=new int[n1];
	if(n>32767)
	{
		System.out.println("Number too large");
	}
	else if(n<0)
	{
		System.out.println("Number too small");
	}
	else
	{
        for(int j=0;n>0;j++)
        {
            r=n%10;
            n=n/10;
            res=1;
            for(int i=r;i>0;i--)
            {
                res=res*i;
            }
            a[j]=res;
            c++;
        }
        for(int k=c-1;k>=0;k--)
        {
            System.out.println(a[k]);
        }
	}
    }
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	factorial(n);
	}
}
