package byrontie.patterns.contructor.builder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// builder pattern
public class Page {

    public static class PageBuilder {

        private String title;
        private Map<String, String> elementLocators = new HashMap<>();
        
        public PageBuilder() {}

        public PageBuilder title(String title) {
            this.title = title;
            return this;
        }

        public PageBuilder elementLocator(String name, String locator) {
            this.elementLocators.put(name, locator);
            return this;
        }

        public Page build() {
            return new Page(this);
        }
    }

    private final String title;
    private final Map<String, String> elementLocators;

    public static PageBuilder getBuilder() {
        return new PageBuilder();
    }

    private Page(PageBuilder builder) {
        this.title = builder.title;
        this.elementLocators = builder.elementLocators;
    }

    public String getTitle() {
        return this.title;
    }

    public Map<String, String> getElementLocators() {
        return Collections.unmodifiableMap(this.elementLocators);
    }
}