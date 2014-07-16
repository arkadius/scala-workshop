package prez2.p01;

import com.google.common.base.Function;
import com.google.common.base.Optional;

public class GuavaOptional {

    public static void main(String[] args) {
        new GuavaOptional().run();
    }

    void run() {
        Optional<Integer> absentInt  = Optional.absent();
        Optional<Integer> presentInt = Optional.of(123);

        System.out.println(usingIfGetSequence(absentInt));
        System.out.println(usingIfGetSequence(presentInt));

        System.out.println(usingTransform(absentInt));
        System.out.println(usingTransform(presentInt));
    }

    Optional<Integer> usingIfGetSequence(Optional<Integer> optionalInt) {
        if (optionalInt.isPresent()) {
            return Optional.of(optionalInt.get() * 2);
        } else {
            return Optional.absent();
        }
    }

    Optional<Integer> usingTransform(Optional<Integer> optionalInt) {
        return optionalInt.transform(new Function<Integer, Integer>() {
            public Integer apply(Integer input) {
                return input * 2;
            }
        });
    }


}

