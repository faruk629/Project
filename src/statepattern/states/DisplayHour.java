package statepattern.states;

import statepattern.DigitalClock;


public class DisplayHour implements ClockState {

	private static DisplayHour instance = null;
	private DisplayHour(){};
	public static DisplayHour Instance() {
		if(instance == null) instance = new DisplayHour();
		return instance;
	}

	@Override
	public void b1(DigitalClock context) {
		context.switchTo(DisplayDate.Instance());
	}

	@Override
	public String toString() {
		return "Display_Hour";
	}
}
