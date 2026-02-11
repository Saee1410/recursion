public class friend {
    public static int friendParing(int n) {
          if(n == 1 || n == 2) {
            return n;
        }
        // int fnm1 = friendParing(n - 1);
        // int fnm2 = friendParing(n - 2);

        // int pairWays = (n - 1) * fnm2;

        // int totWays = fnm1 + pairWays;
        // return totWays;

        return friendParing(n-1) + (n-1) * friendParing(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendParing(n));
    }
}
