public class majorityele {
    public static int majority(int arr[]){
        return findMajority(arr, 0, arr.length-1);
    }
    public static int findMajority(int[] arr, int low, int high){
        //base case
        if(low == high) {
            return arr[low];
        }

        //Divide
        int mid = low + (high - low) /2;

        //conquer
        int leftMajority = findMajority(arr, low, mid);
        int rightMajority = findMajority(arr, mid + 1, high);
 
         //combine
         if (leftMajority == rightMajority) {
            return leftMajority;
         }

         int leftCount = countInRange(arr, leftMajority, low, high);
         int rightCount = countInRange(arr, rightMajority, low, high);
 
         return leftCount > rightCount ? leftMajority : rightMajority;
    }
    public static int countInRange(int[] arr, int num, int low, int high){
        int count = 0;
        for(int i = low; i <= high; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    
    public static void main(String[] args){
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majority(arr));

    }
}
