package statepattern.states;

import statepattern.DigitalClock;

public class DisplaySecond implements ClockState {
	private static DisplaySecond instance = null;
	private DisplaySecond(){};
	public static DisplaySecond getInstance() {
		if(instance == null) instance = new DisplaySecond();
		return instance;
	}
	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplayHour.getInstance());
	}

	@Override
	public void b2(DigitalClock context) {
		context.switchTo(DisplayDate.getInstance());
	}

	@Override
	public String toString() {
		return "DISPLAY_SECOND";
	}
}
