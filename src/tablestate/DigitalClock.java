package tablestate;

import tablestate.event.EventEnum;
import tablestate.states.ClockState;
import tablestate.states.DisplayHour;
import tablestate.transitions.DD2DSTransition;
import tablestate.transitions.DH2DDTransition;
import tablestate.transitions.DS2DHTransition;
import tablestate.transitions.ITransition;

public class DigitalClock {
	private	int	hours, minutes, seconds, dayInMonth, month; 
	private ClockState currentState;
	public DigitalClock() {
		this.currentState = DisplayHour.Instance();
	}
	private ITransition[][] transitionTable = {
			// Current state: DISPLAY_DATE
			{
				DH2DDTransition.Instance()
			},
			// Current state: DISPLAY_HOUR
			{
				DS2DHTransition.Instance()
			},
			// Current state: DISPLAY_SECOND
			{
				DD2DSTransition.Instance()
			}
	};
	
	public void switchTo(ClockState nextState) {
		currentState = nextState;
	}

	public String getState() {
		return currentState.getType().toString();
	}

	public void b1() {
		transitionTable[currentState.getType().ordinal()][EventEnum.B1.index].applyTransition(this);
	}
}
