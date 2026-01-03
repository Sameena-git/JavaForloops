class Main {
    public static void main(String[] args) {
        System.out.print("Increasing Triangle");
        increasingTriangle();
        System.out.println();
        System.out.print("Decreasing Triangle");
        System.out.println();
        decreasingTriangle();
        System.out.println();
        System.out.print("Right Aligned Triangle");
        System.out.println();
        rightAlignedTriangle();
        System.out.println();
        System.out.print("Pyramid Pattern");
        System.out.println();
        pyramidPattern();
        System.out.println();
        System.out.print("Diamond Pattern");
        System.out.println();
        diamondPattern();
        System.out.println();
        System.out.print("Hollow Square");
        System.out.println();
        hollowSquare();
        System.out.println();
    }
    // Function to print an increasing triangle pattern
    static void increasingTriangle() {
        int n=5;
        for (int i=0; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Function to print a decreasing triangle pattern
    static void decreasingTriangle() {
        int n = 5;
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Function to print a right-aligned triangle pattern
    static void rightAlignedTriangle() {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Function to print a pyramid pattern
    static void pyramidPattern() {
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Function to print a diamond pattern
    static void diamondPattern() {
        int n = 5;
        // Upper Pyramid
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower Inverted Pyramid
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Function to print a hollow square pattern
    static void hollowSquare() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}