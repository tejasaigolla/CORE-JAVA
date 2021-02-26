import java.util.*;
public class array
{
static void findElementCount(int a[],int n,int x)
{
int count=0;
if(n<0)
{
System.out.println("Invalid input");
}
else
{
for(int i=0;i<n;i++)
{
if(a[i]==x)
{
count++;
}
}
System.out.println(count);
}
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int flag=0;
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
if(a[i]<0)
{
flag=1;
System.out.println("Invalid Input");
break;
}
}   
if(flag==0)
{
int x=sc.nextInt();
findElementCount(a,n,x);
}
}
}
