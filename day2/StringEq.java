import java.util.*;
import java.lang.*;
public class StringEq
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
String[] s3=s1.split(" ");
String[] s4=s2.split(" ");
if(s3[s3.length-1].equals(s4[s4.length-1])){
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}

