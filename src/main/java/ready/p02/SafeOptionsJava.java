package ready.p02;

public class SafeOptionsJava {

    public static void main(String[] args) {
        Integer someValue = 1;

        Integer noneValue = null;

        printOptional(someValue);
        printOptional(noneValue);
    }

    static void printOptional(Integer optionalValue) {
        if (optionalValue != null)
            System.out.println(optionalValue);
        else
            System.out.println("Nothing to print");
    }


}
