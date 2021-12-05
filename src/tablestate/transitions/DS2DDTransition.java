package tablestate.transitions;

import tablestate.DigitalClock;
import tablestate.states.DisplayDate;

public class DS2DDTransition implements ITransition{
    private static DS2DDTransition instance = null;

    private DS2DDTransition() {}

    public static DS2DDTransition getInstance() {
        if(instance ==null) instance = new DS2DDTransition();
        return instance;
    }
    @Override
    public void applyTransition(DigitalClock context) {
        context.switchTo(DisplayDate.getInstance());
    }
}
