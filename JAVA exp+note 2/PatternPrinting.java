class PatternPrinting {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern
        
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
