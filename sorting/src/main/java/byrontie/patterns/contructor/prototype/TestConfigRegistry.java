package byrontie.patterns.contructor.prototype;

import java.util.Map;
import java.util.HashMap;

// not tested
public class TestConfigRegistry {

    private Map<String, TestConfig> registry = new HashMap<>();

    public TestConfigRegistry() {
        loadItems();
    }

    public TestConfig createTestConfig(String type) {

        TestConfig config = null;

        try {
            config = (TestConfig)(this.registry.get(type).clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return config;
    }

    //This is for showing the pattern. Loading of items should not be hardcoded here. Consider dependency injection instead.
    private void loadItems() {
        TestConfig testValues = new TestConfig();
        testValues.setName("testValues");
        testValues.setSettings((new TestConfigFileReader()).readFileMocked("default.config"));
        this.registry.put(testValues.getName(), testValues);

        TestConfig connectionValues = new TestConfig();
        connectionValues.setName("connectionValues");
        connectionValues.setSettings(new HashMap<>());
        connectionValues.getSettings().put("databaseUser", "byrontie");
        connectionValues.getSettings().put("databasePwd", "password");
        this.registry.put(connectionValues.getName(), connectionValues);
    }
}