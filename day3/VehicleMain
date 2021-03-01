package com.ltts;
import java.io.*;
import java.util.*;
import java.lang.*;
public class VehicleMain 
{
public static void main(String args[])throws Exception
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("1.Four Wheeler");
	System.out.println("2.Two wheeler");
	int n=Integer.parseInt(br.readLine());
	if(n==2)
	{
		System.out.println("Vehicle Make:");
		String make=br.readLine();
		System.out.println("Vehicle Number:");
		String number=br.readLine();
		System.out.println("Fuel Type");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int t=Integer.parseInt(br.readLine());
		String fuel="";
		if(t==1)
		{
			fuel="Petrol";
		}
		else if(t==2)
		{
			fuel="Diesel";
		}
		else
		{
			fuel="";
		}
		System.out.println("Fuel Capacity:");
		int cap=Integer.parseInt(br.readLine());
		System.out.println("Engine CC");
		int cc=Integer.parseInt(br.readLine());
		System.out.println("Kick Start Available [YES/NO]:");
		String s=br.readLine();
		boolean b=true;
		if(s.equalsIgnoreCase("Yes"))
		{
			b=true;
		}
		else
		{
			b=false;
		}
		TwoWheeler tw=new TwoWheeler(make,number,fuel,cap,cc,b);
		tw.displayMake();
		tw.displayBasicInfo();
		tw.displayDetailInfo();
		
	}
	else {
		System.out.println("Vehicle Make:");
		String make=br.readLine();
		System.out.println("Vehicle Number:");
		String number=br.readLine();
		System.out.println("Fuel Type");
		System.out.println("1.Petrol");
		System.out.println("2.Diesel");
		int t=Integer.parseInt(br.readLine());
		String fuel="";
		if(t==1)
		{
			fuel="Petrol";
		}
		else if(t==2)
		{
			fuel="Diesel";
		}
		else
		{
			fuel="";
		}
		System.out.println("Fuel Capacity:");
		int cap=Integer.parseInt(br.readLine());
		System.out.println("Engine CC");
		int cc=Integer.parseInt(br.readLine());
		
		
		System.out.println("Audio System:");
		String as=br.readLine();
		System.out.println("numberOfDoors:");
		int nod=Integer.parseInt(br.readLine());
		FourWheeler tw=new FourWheeler(make,number,fuel,cap,cc,as,nod);
		tw.displayMake();
		tw.displayBasicInfo();
		tw.displayDetailInfo();
	}
}
}
