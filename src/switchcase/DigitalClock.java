package switchcase;

public class DigitalClock {
	
	private	int	hours, minutes, seconds, dayInMonth, month; 
	private StateEnum currentState = StateEnum.DisplayHour;
	public void switchTo(StateEnum nextState) {
		currentState = nextState;
	}
	
	public void b1()
	{
		switch (currentState)
		{
			case DisplayDate:
				switchTo(StateEnum.DisplaySecond);
			break;
			case DisplaySecond:
				switchTo(StateEnum.DisplayHour);
			break;
			case DisplayHour:
				switchTo(StateEnum.DisplayDate);
			break;
		}
		
	}

	public String getState() {
		return this.currentState.label;
	}
}
