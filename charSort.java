public class charSort {
    public static void mergeSort(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);       // Left part
        mergeSort(arr, mid + 1, ei);   // Right part

        merge(arr, si, mid, ei);       // Corrected: pass 'mid' only
    }

    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si;      // iterator for left side
        int j = mid + 1; // iterator for right side
        int k = 0;       // iterator for temp

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Fix: Bachay hue elements (Left side)
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Bachay hue elements (Right side)
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}