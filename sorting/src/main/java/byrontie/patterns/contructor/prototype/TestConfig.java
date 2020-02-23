package byrontie.patterns.contructor.prototype;

import java.util.Map;

public class TestConfig implements Cloneable {
    
    private String name;
    private Map<String, String> settings;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getSettings() {
        return settings;
    }

    public void setSettings(Map<String, String> settings) {
        this.settings = settings;
    }


}