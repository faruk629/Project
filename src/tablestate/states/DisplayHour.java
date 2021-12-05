package tablestate.states;

import tablestate.DigitalClock;

public class DisplayHour extends ClockState {
	private static DisplayHour instance = null;
	private DisplayHour() {};
	public static DisplayHour Instance() {
		if(instance==null) instance= new DisplayHour();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.Display_Hour;
	}
}
