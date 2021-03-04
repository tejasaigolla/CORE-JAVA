import java.util.Comparator;

public class PlayerComparator implements Comparator<Player1> {

	@Override
	public int compare(Player1 p1, Player1 p2) {
		// TODO Auto-generated method stub
		return p1.getSkill().compareTo(p2.getSkill());
	}
}
