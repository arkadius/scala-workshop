package prez1.p08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeclarativeProgrammingJava {

    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(
            new Duck("Donald", "m", 20),
            new Duck("Sknerus McKwacz", "m", 60),
            new Duck("Della", "f", 30),
            new Duck("Hyzio", "m", 5),
            new Duck("Zyzio", "m", 5),
            new Duck("Dyzio", "m", 5)
        );

        List<String> adultMalesNames = findAdultMalesNames(ducks);
        System.out.println(adultMalesNames);
    }

    static List<String> findAdultMalesNames(List<Duck> ducks) {
        List<String> adultMalesNames = new ArrayList<>();
        for (Duck duck : ducks) {
            if (duck.isAdult() && duck.isMale())
                adultMalesNames.add(duck.name);
        }
        return adultMalesNames;
    }

    static class Duck {
        String name;
        String gender;
        int age;

        Duck(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        boolean isMale() {
            return gender.equals("m");
        }

        boolean isFemale() {
            return gender.equals("f");
        }

        boolean isAdult() {
            return age >= 18;
        }

    }


}
