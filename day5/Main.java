

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
	public static void main(String[] args)throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Player1> al=new ArrayList<Player1>();
		System.out.println("Please provide the number of players to be registered");
		int n=Integer.parseInt(br.readLine());
		int n1;
		for(int i=0;i<n;i++)
		{
			System.out.println("Please enter player name");
			String s=br.readLine();
			System.out.println("Please Select the skill of the player");
			System.out.println("1.All Rounder");
			System.out.println("2.Batsman");
			System.out.println("3.Bowler");
			n1=Integer.parseInt(br.readLine());
			if(n1==1)
			{
				al.add(new Player1(s,"All Rounder"));
			}
			else if(n1==2)
			{
				al.add(new Player1(s,"Batsman"));
			}
			else
			{
				al.add(new Player1(s,"Bowler"));
			}
		}
		System.out.println("Player Details");
		Collections.sort(al,new PlayerComparator());
		for(Player1 p:al)
		{
			System.out.println(p);
		}
		

	}

}
