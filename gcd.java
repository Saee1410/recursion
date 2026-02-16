 //GCD (Greatest Common Divisor) - Euclidean Algorithm
public class gcd {
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("12 & 18 GCD: " + findGCD(12, 18));
    }
}
