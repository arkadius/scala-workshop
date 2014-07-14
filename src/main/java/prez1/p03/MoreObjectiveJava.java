package prez1.p03;

public class MoreObjectiveJava {

    public static void main(String[] args) {
        Named named = new Duck("Donald");
        System.out.println(named.name);
    }

    static abstract class Named {
        String name;
    }

    static class Duck extends Named {
        String name;

        Duck(String name) {
            this.name = name;
        }
    }

}
