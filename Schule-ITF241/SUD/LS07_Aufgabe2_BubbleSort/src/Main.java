public class Main {
    public static void main(String[] args) {

        int[] zahlen = {5, 2, 9, 1, 5, 6};

        bubbleSort(zahlen);

        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}