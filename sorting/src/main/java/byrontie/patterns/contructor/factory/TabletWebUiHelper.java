package byrontie.patterns.contructor.factory;

import byrontie.patterns.contructor.factory.actions.ClickActions;
import byrontie.patterns.contructor.factory.actions.FlyoutMenuActions;
import byrontie.patterns.contructor.factory.actions.MenuActions;
import byrontie.patterns.contructor.factory.actions.ScrollAndDrag;

public class TabletWebUiHelper extends WebUiHelper {
    
    protected void createHelper() {
        this.actions.add(new ClickActions());
        this.actions.add(new FlyoutMenuActions());
        this.actions.add(new MenuActions());
        this.actions.add(new ScrollAndDrag());
    }
}