public class maxArr {
    static int findMax(int arr[], int n){
        if(n == 1){
            return arr[0];
        }
        return Math.max(arr[n-1], findMax(arr, n-1));
    }
    public static void main(String[] args) {
        int nums[] = {10, 55, 32, 98, 45};
        System.out.println("Maximum sankhya aahe: " + findMax(nums, nums.length));
    }
}
