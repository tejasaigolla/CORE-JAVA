package com.ltts;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the total runs scored");
			int x=Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			float y=Float.parseFloat(br.readLine());
			float z=x/y;
			System.out.printf("Current Run Rate :"+"%.2f",z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	}
