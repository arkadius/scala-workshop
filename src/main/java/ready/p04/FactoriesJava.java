package ready.p04;

public class FactoriesJava {

    public static void main(String[] args) {
        Duck donald = DuckFactory.createDonaldDuck();
        System.out.println(donald.name);
    }

    static class Duck {
        String name;

        Duck(String name) {
            this.name = name;
        }
    }

    static class DuckFactory {
        static Duck createDonaldDuck() {
            return new Duck("Donald");
        }
    }

}
