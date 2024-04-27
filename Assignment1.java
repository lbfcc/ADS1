public class Assignment1 {

    // Problem 1:
    public static int findMinimum(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        return Math.min(arr[n-1], findMinimum(arr, n-1));
    }

    // Problem 2:
    public static double findAverage(int[] arr, int n) {
        if (n == 0)
            return 0;
        return (arr[n-1] + (n-1) * findAverage(arr, n-1)) / (double) n;
    }

    // Problem 3:
    public static boolean isPrime(int n, int divisor) {
        if (n <= 2)
            return (n == 2);
        if (n % divisor == 0)
            return false;
        if (divisor * divisor > n)
            return true;
        return isPrime(n, divisor + 1);
    }

    // Problem 4:
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n-1);
    }

    // Problem 5:
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    // Problem 6:
    public static double power(double a, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 1 / power(a, -n);
        return a * power(a, n-1);
    }

    // Problem 7:
    public static void permute(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left+1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    // Problem 8:
    public static boolean consistsOfDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    // Problem 10:
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr = {5, 3, 9, 1, 7};
        int n = arr.length;
        System.out.println("Minimum: " + findMinimum(arr, n));
        System.out.println("Average: " + findAverage(arr, n));
        System.out.println("Is 7 prime? " + isPrime(7, 2));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("10th Fibonacci number: " + fibonacci(10));
        System.out.println("2^4: " + power(2, 4));
        String str = "abc";
        System.out.println("Permutations of " + str + ":");
        permute(str, 0, str.length()-1);
        System.out.println("Is '123abc' consisting of digits? " + consistsOfDigits("123abc"));
        System.out.println("GCD of 24 and 36: " + gcd(24, 36));
    }
}
