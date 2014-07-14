package prez1.p04;

public class StaticsMoreObjectiveJava {

    public static void main(String[] args) {
        QuackingUtils utils = new DuckQuackingUtils();
        utils.quack();
    }

    static class QuackingUtils {
        static void quack() {
            System.out.println("Generic quack");
        }
    }

    static class DuckQuackingUtils extends QuackingUtils {
        static void quack() {
            System.out.println("Duck quack");
        }
    }


}
