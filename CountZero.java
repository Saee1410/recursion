public class CountZero {
    static int countZero( int n) {
        if(n == 0){
            return 0;
        }
        int lastDigit = n % 10;
        int res = (lastDigit == 0) ? 1 : 0;

        return res + countZero( n / 10);
    }
    public static void main(String[] args) {
        int n = 1002003;
        System.out.println("Number of zeroes: " + countZero(n));
    }
}
