package Lotto;

public class Program {
    
    public static void main(String[] args) {
        print(Randoms.get());
        print(Inputs.get());
    }

    private static void print(int[] arr) {
        StringBuilder output = new StringBuilder(Integer.toString(arr[0]));
        for(int i = 1; i < arr.length; i++) {
            output.append(", ");
            output.append(arr[i]);
        }
        System.out.println(output.toString());
    }
}
