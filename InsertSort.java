package sort;

public class InsertSort {

    public static void Sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int newEl = arr[i];
            int k = i - 1;
            while (k >= 0 && arr[k] > newEl) {
                arr[k + 1] = arr[i];
                k--;
            }
            arr[k + 1] = newEl;
        }

    }

}