package tablestate.states;

import tablestate.DigitalClock;

public class DisplaySecond extends ClockState {
	private static DisplaySecond instance = null;
	private DisplaySecond() {}
	public static DisplaySecond Instance() {
		if(instance == null) instance = new DisplaySecond();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.Display_Second;
	}
}
