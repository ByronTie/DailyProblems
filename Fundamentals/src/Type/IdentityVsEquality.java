package byrontie.type;

public class IdentityVsEquality {

    public void runAll() {

        String str1 = "string";
        String str2 = "string"; //assign to memory ref with same value
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println();

        str2 = "other string";
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println();

        System.out.println("new String == new String: " + (new String("string") == new String("string")));
        System.out.println("new String equals new String: " + (new String("string").equals(new String("string"))));
        System.out.println();
    }
}
