package week_12;
enum Signal{
	RED,YELLOW,GREEN
}
public class checkSignal 
{
	Signal currentSingal;
	public checkSignal(Signal cs)
	{
		this.currentSingal=cs;
	}
	public void makeRide()
	{
		switch(currentSingal) {
		case RED:
			System.out.println("The Signal is Red .\n Kindly wait until the system turns into GREEN ");
		case YELLOW:
			System.out.println("The Signal is YELLOW .\n Kindly make a safe move");
		case GREEN:
			System.out.println("Make a safe ride");
		}
		
	}
}
class demoenum{
	public static void main(String args[])
	{
		checkSignal myDrive = new checkSignal(Signal.GREEN.RED.YELLOW);
		myDrive.makeRide();
	}
}