package com.ltts;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MatchMain {

	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter the Match Format");
       System.out.println("1.ODI");
       System.out.println("2.T20");
       System.out.println("3.Test");
       int n=Integer.parseInt(br.readLine());
       Match mat=new ODIMatch();
       Match tmat=new T20Match();
       Match temat=new T20Match();

       if(n==1)
       {
    	   System.out.println("Enter the Current score");
    	   int cs=Integer.parseInt(br.readLine());
    	   mat.setCurrentscore(cs);
    	   System.out.println("Enter the Current Over");
    	   float co=Integer.parseInt(br.readLine());
    	   mat.setCurrentover(co);
    	   System.out.println("Enter the Target score");
    	   int ts=Integer.parseInt(br.readLine());
    	   mat.setTarget(ts);
    	   System.out.println("Requirements:");
    	   mat.display(mat.calculateRunRate(),mat.calculateBalls());
       }
       else if(n==2)
       {
    	   System.out.println("Enter the Current score");
    	   int cs=Integer.parseInt(br.readLine());
    	   tmat.setCurrentscore(cs);
    	   System.out.println("Enter the Current Over");
    	   float co=Integer.parseInt(br.readLine());
    	   tmat.setCurrentover(co);
    	   System.out.println("Enter the Target score");
    	   int ts=Integer.parseInt(br.readLine());
    	   tmat.setTarget(ts);
    	   System.out.println("Requirements:");
    	   tmat.display(tmat.calculateRunRate(),tmat.calculateBalls());
       }
       else
       {
    	   System.out.println("Enter the Current score");
    	   int cs=Integer.parseInt(br.readLine());
    	   temat.setCurrentscore(cs);
    	   System.out.println("Enter the Current Over");
    	   float co=Integer.parseInt(br.readLine());
    	   temat.setCurrentover(co);
    	   System.out.println("Enter the Target score");
    	   int ts=Integer.parseInt(br.readLine());
    	   temat.setTarget(ts);
    	   System.out.println("Requirements:");
    	   temat.display(temat.calculateRunRate(),temat.calculateBalls());
       }
       
	}

}
