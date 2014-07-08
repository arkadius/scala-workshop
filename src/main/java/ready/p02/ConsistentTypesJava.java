package ready.p02;

import java.util.*;

public class ConsistentTypesJava {

    public static void main(String[] args) {
        int i = 1;
        List<Integer> listOfInts = Collections.singletonList(i);

        boolean b = true;
        List<Boolean> listOfBools = Collections.singletonList(b);

        Boolean[] arraysOfBools = { b };
        List<Boolean> seqOfBools = listOfBools;
        seqOfBools = Arrays.asList(arraysOfBools);
    }


}
