package tablestate.states;

public class DisplayDate extends ClockState {
	private static DisplayDate instance = null;
	private DisplayDate() {}
	public static DisplayDate getInstance() {
		if(instance == null) instance = new DisplayDate();
		return instance;
	}

	@Override
	public StateEnum getType() {
		return StateEnum.DISPLAY_DATE;
	}
}
