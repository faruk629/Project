package statepattern.states;

import statepattern.DigitalClock;

public class DisplaySecond implements ClockState {
	private static DisplaySecond instance = null;
	private DisplaySecond(){};
	public static DisplaySecond Instance() {
		if(instance == null) instance = new DisplaySecond();
		return instance;
	}
	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplayHour.Instance());
	}

	@Override
	public String toString() {
		return "Display_Second";
	}
}
