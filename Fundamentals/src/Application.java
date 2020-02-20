package byrontie;

import Type.IdentityVsEquality;
import Type.ReferenceInMethods;

public class Application {

    public static void main(String[] args) {
        new IdentityVsEquality().runAll();
        new ReferenceInMethods().runAll();
    }
}
