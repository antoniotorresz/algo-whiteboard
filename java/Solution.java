class Solution {
    public static void main(String[] args) {
      int N = 10;
      for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N - i; j++) {
          System.out.print(" ");
        }
        for (int k = 1; k <= (2 * i - 1); k++) {
          System.out.print("*");
        }
        System.out.println();
      }
    }
  }