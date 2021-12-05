package tablestate.states;

import tablestate.DigitalClock;

public class DisplayDate extends ClockState {
	private static DisplayDate instance = null;
	private DisplayDate() {}
	public static DisplayDate Instance() {
		if(instance == null) instance = new DisplayDate();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.Display_Date;
	}
}
