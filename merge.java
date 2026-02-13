public class merge {
    public static void mergeSort(int[] arr, int si, int ei) {
        // BASE CASE: If the range has 1 or 0 elements, stop.
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);       // left part
        mergeSort(arr, mid + 1, ei);   // right part
        merge(arr, si, mid, ei);       // merging the parts
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;      // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;       // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++; // Increment k once per comparison
        }

        // Remaining elements of left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Remaining elements of right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}