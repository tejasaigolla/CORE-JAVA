import java.util.*;
import java.lang.*;
import java.io.*;
public class StringEx
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
String s3=s1.substring(0,1);
String s4=s2.substring(0,1);
s3=s3.toUpperCase();
s4=s4.toUpperCase();
String s5=s1.substring(1);
String s6=s2.substring(1);
s5=s5.toLowerCase();
s6=s6.toUpperCase();
String s7=s3.concat(s5);
String s8=s4.concat(s6);
s7=s7.concat(" ");
System.out.println(s7.concat(s8));
}
}
