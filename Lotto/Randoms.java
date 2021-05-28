package Lotto;

import java.util.Random;

public class Randoms {
    
    public static int[] get() {
        Random r = new Random();
        SortedInputs ins = new SortedInputs(() -> r.nextInt(49) + 1, () -> {});
        return ins.get();
    }
}
