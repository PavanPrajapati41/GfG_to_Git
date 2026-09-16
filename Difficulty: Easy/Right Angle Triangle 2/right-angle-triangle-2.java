class Solution {
    public void printPattern(int n) {
        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                System.out.println("*");
            }
            else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                System.out.print("*");

                for (int j = 1; j <= 2 * i - 3; j++) {
                    System.out.print(" ");
                }

                System.out.println("*");
            }
        }
    }
}