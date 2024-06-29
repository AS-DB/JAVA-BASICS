class CalculateE_Constant {
    public static void main(String[] args) {
        int n = 5; // Number of terms in the series
        double e = 1.0; // Initial value of e
        
        for (int i = 1; i <= n; i++) {
            e += 1.0 / factorial(i);
        }
        
        System.out.println("Value of 'e' calculated up to " + n + " terms: " + e);
    }

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
