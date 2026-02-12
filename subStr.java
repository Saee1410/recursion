public class subStr {
    public static int subStr(String str, int i, int j, int n) {
        if(n == 1) {
            
            return 1;
        }
        // to be
        if(n <= 0){
            return 0;
        }

        int res = subStr(str, i + 1, j, n - 1) +
         subStr(str, i, j -1, n-1) - 
         subStr(str, i +1, j - 1, n - 2);

         if(str.charAt(i) == str.charAt(j)) {
            res++;
         }
         return res;
    }
    public static void main(String[] args) {
        String str = "abcdb";
        int n = str.length();
        System.out.println(subStr(str, 0, n-1, n));
    }
}
