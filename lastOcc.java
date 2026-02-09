public class lastOcc {
    public static int lastOcc(int arr[], int key, int i) {
        if( i < 0) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }else {
            return lastOcc(arr, key, i-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,5};
        int key = 5;
        System.out.println(lastOcc(arr, key, arr.length-1));
        
    }
}
