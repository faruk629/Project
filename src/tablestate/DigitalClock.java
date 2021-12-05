package tablestate;

import tablestate.event.EventEnum;
import tablestate.states.ClockState;
import tablestate.states.DisplayHour;
import tablestate.transitions.*;

public class DigitalClock {
	private	int	hours, minutes, seconds, dayInMonth, month; 
	private ClockState currentState;
	public DigitalClock() {
		this.currentState = DisplayHour.getInstance();
	}
	private ITransition[][] transitionTable = {
			// Current state: DISPLAY_HOUR
			{
				DH2DDTransition.getInstance(), DH2DSTransition.getInstance()
			},
			// Current state: DISPLAY_SECOND
			{
				DS2DHTransition.getInstance(), DS2DDTransition.getInstance()
			},
			// Current state: DISPLAY_DATE
			{
				DD2DSTransition.getInstance(), DD2DHTransition.getInstance()
			}
	};
	
	public void switchTo(ClockState nextState) {
		currentState = nextState;
	}

	public String getState() {
		return currentState.getType().toString();
	}

	public void b1() {
		transitionTable[currentState.getType().ordinal()][EventEnum.B1.ordinal()].applyTransition(this);
	}

	public void b2() {
		transitionTable[currentState.getType().ordinal()][EventEnum.B2.ordinal()].applyTransition(this);
	}

}
