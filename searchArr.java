public class searchArr {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Case Found
        if (arr[mid] == tar) {
            return mid;
        }

        // Mid on Line 1 (Left sorted part)
        if (arr[si] <= arr[mid]) {
            // Case a: Target is in the left sorted part
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Case b: Target is in the right part
                return search(arr, tar, mid + 1, ei);
            }
        } 
        // Mid on Line 2 (Right sorted part)
        else {
            // Case c: Target is in the right sorted part
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Case d: Target is in the left part
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int tar = 2;
        int tarIdx = search(arr, tar, 0, arr.length - 1);
        System.out.println("Target index is: " + tarIdx);
    }
}
