package Lotto;

import java.util.Scanner;

public class Inputs {

    private static Scanner sc;
    
    public static int[] get() {
        sc = new Scanner(System.in);
        SortedInputs ins = new SortedInputs(() -> nextInt(), () -> System.out.println("Number was already used before. Try something else."));
        int[] inputs = ins.get();
        sc.close();
        return inputs;
    }

    private static int nextInt() {
        try {
            int val = sc.nextInt();
            if(val > 49 | val < 1)
                throw new Exception();
            return val;
        } catch(Exception e) {
            System.out.println("Invalid Input - try using a number between 1 and 49 inclusively!");
            return nextInt();
        }
    }
}
