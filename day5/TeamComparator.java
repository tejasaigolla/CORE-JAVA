
import java.util.Comparator;

public class TeamComparator implements Comparator<Team1>{

	@Override
	public int compare(Team1 t1, Team1 t2) {
		// TODO Auto-generated method stub
		if(t1.getNumberOfMatches()==t2.getNumberOfMatches())
		{
			return 0;
		}
		else if(t1.getNumberOfMatches()>t2.getNumberOfMatches())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	

}
