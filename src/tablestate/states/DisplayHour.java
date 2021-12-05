package tablestate.states;

public class DisplayHour extends ClockState {
	private static DisplayHour instance = null;
	private DisplayHour() {};
	public static DisplayHour getInstance() {
		if(instance==null) instance= new DisplayHour();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.DISPLAY_HOUR;
	}
}
