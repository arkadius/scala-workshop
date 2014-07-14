package prez1.p01;

public class LessBoilerplateJava {

    public static void main(String[] args) throws Exception {
        Duck duck = new Duck();
        duck.quack();

        boolean eatCockroach = duck.doesEat("cockroach");
        System.out.println("duck eat cockroach: " + eatCockroach);

        boolean eatEarthworm = duck.doesEat("earthworm");
        System.out.println("duck eat cockroach: " + eatEarthworm);

        duck.eat("earthworm", false);
        duck.eat("cockroach", true);
    }

    static class Duck {
        void quack() {
            System.out.println("Quack");
        }

        boolean doesEat(String worm) {
            return worm.equals("earthworm");
        }

        void eat(String worm, boolean productionMode) throws Exception {
            if (doesEat(worm))
                System.out.println("Yummy");
            else if (!productionMode)
                throw new Exception("Can't eat this");
            else
                System.out.println("Good enough");
        }

    }

}
