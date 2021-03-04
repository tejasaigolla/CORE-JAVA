import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TeamMain {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of teams:");
		ArrayList<Team1> al=new ArrayList<Team1>();
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team "+(i+1)+" detail");
			System.out.println("Enter Name");
			String s=br.readLine();
			System.out.println("Enter number of matches");
			int n1=Integer.parseInt(br.readLine());
			al.add(new Team1(s,n1));
		}
		System.out.println("Team list after sort by number of matches");
		Collections.sort(al,new TeamComparator());
		for(Team1 t1:al)
		{
			System.out.println(t1);
		}
		

	}

}
