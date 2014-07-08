package ready.p01;

public class TraitsJava {

    public static void main(String[] args) {
        Quacking donald = new DonaldDuck();
        donald.quack();
    }

    static class DonaldDuck implements Named, Quacking {
        public String name() {
            return "Donald";
        }

        public void quack() {
            QuackingUtils.quack(this);
        }
    }

    static interface Named {
        String name();
    }

    static interface Quacking {
        void quack();
    }

    static class QuackingUtils {
        public static void quack(Named named) {
           System.out.println(named.name() + ": quack");
        }
    }

}
