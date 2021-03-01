public class TwoWheeler extends vehicle{
	private boolean kickStartAvailable;
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
	public void displayDetailInfo()		
	{
			if(kickStartAvailable==true)
				System.out.println("kickStartAvailable:Yes");
			else
				System.out.println("kickStartAvailable:No");
	}
}
