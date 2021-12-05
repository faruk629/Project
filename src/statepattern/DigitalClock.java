package statepattern;

import statepattern.states.ClockState;
import statepattern.states.DisplayDate;
import statepattern.states.DisplayHour;

//DisplayDate, DisplayHour and DisplaySecond are states classes
//DigitalClock is a context class
public class DigitalClock {

	private	int	hours, minutes, seconds, dayInMonth, month;
	private ClockState currentState;

	public DigitalClock() {
		this.currentState = DisplayHour.Instance();
	}
	public void switchTo(ClockState nextState) {
		currentState = nextState;
	}

	public void b1() {
		currentState.b1(this);
	}

	public String getState() {
		return this.currentState.toString();
	}
}
