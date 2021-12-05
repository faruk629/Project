package tablestate.states;

import tablestate.DigitalClock;

public abstract class ClockState {
	/**
	 * Returns the type of the state
	 * @return StateEnum the type of the state
	 */
	public abstract StateEnum getType();
}
