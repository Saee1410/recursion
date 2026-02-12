public class digit {
  static String digits[] = {"zero", "one", "two",
   "three","four", "five","six","seven", "eight", "nine"} ;

   public static void printDigits(int n) {
    if(n == 0){
        return;
    }

    
    printDigits(n / 10);

    int lastDigit = n % 10;
    System.out.print(digits[lastDigit] + " ");
   }
    public static void main(String[] args) {
     int n = 2026;
     printDigits(n);
    }
}
