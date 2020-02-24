package byrontie.patterns.contructor.factory;

import java.util.List;
import java.util.ArrayList;
import byrontie.patterns.contructor.factory.actions.UiActions;

public abstract class WebUiHelper {
    
    protected List<UiActions> actions = new ArrayList<>();

    public WebUiHelper() {
        this.createHelper();
    }

    protected abstract void createHelper();
}