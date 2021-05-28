package Lotto;

public class SortedInputs {

    private Input input;
    private Handler handler;

    public SortedInputs(Input input, Handler handler) {
        this.input = input;
        this.handler = handler;
    }

    public int[] get() {
        int[] elements = new int[6];
        for(int i = 0; i < 6; i++) {
            int next = input.nextInt();

            boolean contains = false;
            for(int e : elements)
                if(next == e) {
                    contains = true;
                    break;
                }
            if(contains) {
                handler.onInvalid();
                i--;
                continue;
            }

            elements[i] = next;
            for(int j = i; j > 0; j--) {
                int prev = j - 1;
                if(elements[j] > elements[prev])
                    break;
                switchValues(elements, j, prev);
            }
        }
        return elements;
    }

    private static void switchValues(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

interface Input {
    int nextInt();
}

interface Handler {
    void onInvalid();
}
