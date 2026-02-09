public class power {
    public static int optimizedPow(int a, int n){
        if(n==0) {
            return 1;
        }
         
        int halfPower = optimizedPow(a, n/2);
            int halfPowerSq = halfPower * halfPower;
        // int halfPowerSq = optimizedPow(a, n/2) * optimizedPow(a, n/2);

        //n is odd
        if(n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

   // public static int pow(int x, int n) {
//         if( n == 0){
//         return 1;
//         }
//     // int xnm1 =  pow(x, n-1);
//     // int xn = x * xnm1;
//     //  return xn;
//     return x * pow(x, n-1); //short cut

//  }
 public static void main(String[] args) {
    int x = 2;
    int n = 5;
   // System.out.println(pow(x, n));
    System.out.println(optimizedPow(x, n));

 }

}
