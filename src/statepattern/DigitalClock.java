package statepattern;

import statepattern.states.ClockState;
import statepattern.states.DisplayHour;

//DisplayDate, DisplayHour and DisplaySecond are states classes
//DigitalClock is a context class
public class DigitalClock { //  dcStatePattern.getState();


	private	int	hours, minutes, seconds, dayInMonth, month;
	private ClockState currentState;

	public DigitalClock() {
		this.currentState = DisplayHour.getInstance();
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

	public void b2() {
		currentState.b2(this);
	}
}
