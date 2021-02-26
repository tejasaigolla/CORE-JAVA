
import java.util.*;
class EmployeeMain
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Employee e=new Employee();
System.out.println("Enter the name:");
String s1=sc.nextLine();
System.out.println("Enter Address:");
String s2=sc.nextLine();
System.out.println("Enter Mobile:");
String s3=sc.next();
e.setname(s1);
e.setaddress(s2);
e.setmobileno(s3);
System.out.println("Employee Details");
System.out.println("Name:"+e.getname());
System.out.println("Address:"+e.getaddress());
System.out.println("Mobile:"+e.getmobileno());
}
}
