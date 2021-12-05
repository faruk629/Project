package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplayDate;

public class DH2DDTransition implements ITransition{
    private static DH2DDTransition instance = null;

    private DH2DDTransition() {}

    public static DH2DDTransition Instance() {
        if(instance ==null) instance = new DH2DDTransition();
        return instance;
    }

    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplayDate.Instance());
    }
}
