public class allOcc {
    public static void allOccurrences(int arr[], int key, int i){
        if(i == arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+" ");
        }
        allOccurrences(arr, key, i + 1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,2,4,5,6,7,2,2,2};
        int key = 2;
        allOccurrences(arr, key, 0);
    }    
}
