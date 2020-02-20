package byrontie.patterns.constructor;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import byrontie.TestBase;
import byrontie.patterns.contructor.TestContextSingleton;

public class TestContextSingletonTest extends TestBase {

    @Test
    public void testSameInstanceIsReturned() {
        TestContextSingleton instance1 = TestContextSingleton.getInstance();
        TestContextSingleton instance2 = TestContextSingleton.getInstance();

        assertEquals(instance1, instance2);
    }
}