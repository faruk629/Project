package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplaySecond;

public class DH2DSTransition implements ITransition{
    private static DH2DSTransition instance = null;

    private DH2DSTransition() {}

    public static DH2DSTransition getInstance() {
        if(instance ==null) instance = new DH2DSTransition();
        return instance;
    }

    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplaySecond.getInstance());
    }
}
