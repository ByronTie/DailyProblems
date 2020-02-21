package byrontie.patterns.constructor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import byrontie.TestBase;
import byrontie.patterns.contructor.Page;
import byrontie.patterns.contructor.Page.PageBuilder;

public class PageBuilderTest extends TestBase {

    @Test
    public void testBuildDefaultPage() {
        PageBuilder builder = Page.getBuilder();
        Page actualPage = builder.build();
        assertEquals(actualPage.getTitle(), null);
        assertEquals(actualPage.getElementLocators().size(), 0);
    }

    @Test
    public void testPageValuesSetCorrectly() {
        PageBuilder builder = Page.getBuilder();
        builder.title("test title");
        builder.elementLocator("element_1", "this is a locator for element 1");
        builder.elementLocator("element_2", "this is a locator for element 2");

        Page actualPage = builder.build();
        assertEquals(actualPage.getTitle(), "test title");
        assertEquals(actualPage.getElementLocators().size(), 2);
        assertEquals(actualPage.getElementLocators().get("element_1"), "this is a locator for element 1");
        assertEquals(actualPage.getElementLocators().get("element_2"), "this is a locator for element 2");
    }

    @Test
    public void testElementLocatorIsUnmodifiable() {
        PageBuilder builder = Page.getBuilder();
        Page actualPage = builder.build();
        
        boolean canModify = true;
        try {
            actualPage.getElementLocators().put("newElement", "new element locator");
        } catch (UnsupportedOperationException e) {
            canModify = false;
        }

        assertFalse(canModify);
    }
}