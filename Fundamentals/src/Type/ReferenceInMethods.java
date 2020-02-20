package byrontie.type;

public class ReferenceInMethods {

    public void runAll() {

        int value = 10;
        System.out.println("value before: " + value);
        incrementIntByValue(value);
        System.out.println("value after: " + value);
        System.out.println();

        Integer valueInt = Integer.valueOf(20);
        System.out.println("valueInt before: " + valueInt);
        System.out.println("incrementIntByRef: " + incrementIntByRef(valueInt));
        System.out.println("valueInt after: " + valueInt);
        System.out.println();

        Integer valueInt2 = Integer.valueOf(30);
        System.out.println("== cloneAndIncrementInt: " + (valueInt2 == cloneAndIncrementInt(valueInt2)));
        System.out.println("valueInt2: " + valueInt2);
        System.out.println("equals cloneAndIncrementInt " + (valueInt2.equals(cloneAndIncrementInt(valueInt2))));
        System.out.println("valueInt2: " + valueInt2);
        System.out.println();

        Integer valueInt3 = Integer.valueOf(40);
        System.out.println("valueInt3 == clone: " + (valueInt3 == cloneInt(valueInt3)));
        System.out.println("valueInt3.equals(clone): " + valueInt3.equals(cloneInt(valueInt3)));
        System.out.println();
    }

    private int incrementIntByValue(int value) {
        value = value + 1;
        return value;
    }

    private Integer incrementIntByRef(Integer value) {
        value = value + 1; //this should create a new object ref, so argument value should stay unchanged
        return value;
    }

    private Integer cloneAndIncrementInt(Integer value) {
        value = cloneInt(value);
        value = value + 1;
        System.out.println("value: " + value);
        return value;
    }

    private Integer cloneInt(Integer value) {
        return Integer.valueOf(value.toString());
    }
}
