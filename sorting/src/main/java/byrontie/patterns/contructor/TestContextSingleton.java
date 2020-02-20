package byrontie.patterns.contructor;

public class TestContextSingleton {

    private static volatile TestContextSingleton instance = null;

    //make private
    private TestContextSingleton() {
        //prevent instantiation threw reflection
        if(instance != null) {
            throw new RuntimeException("Use getInstance() method instead.");
        }
    }

    public static TestContextSingleton getInstance() {
        if (instance == null) {
            //lazy loading. synchronize only when needed.
            synchronized(TestContextSingleton.class) {
                //check for any holds from other threads.
                if(instance == null) {
                    instance = new TestContextSingleton();
                }
            }
        }

        return instance;
    }
}