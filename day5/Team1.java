
public class Team1 {
	private String name;
	private long numberOfMatches;
	public Team1(String name, long numberOfMatches) {
		super();
		this.name = name;
		this.numberOfMatches = numberOfMatches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumberOfMatches() {
		return numberOfMatches;
	}
	public void setNumberOfMatches(long numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}
	@Override
	public String toString() {
		return  name + "--" + numberOfMatches;
	}
	
}
