package Lotto;

public class Game {
    
    private int[] ins;
    private int[] key;

    public void run() throws InterruptedException {
        ins = Inputs.get();
        key = Randoms.get();
        System.out.println("\nYou chose the Numbers:\n" + str(ins) + "\nRandomly drawn Numbers:\n" + str(key) + "\n--------------------");
        Thread.sleep(500);
        System.out.println("You guessed " + match() + " Numbers correctly.");
    }

    private static String str(int[] arr) {
        StringBuilder output = new StringBuilder(Integer.toString(arr[0]));
        for(int i = 1; i < arr.length; i++) {
            output.append(", ");
            output.append(arr[i]);
        }
        return output.toString();
    }

    private int match() {
        int counter = 0;
        for(int in : ins)
            for(int k : key) {
                if(in == k)
                    counter++;
                if(in <= k)
                    break;
            }
        return counter;
    }
}
