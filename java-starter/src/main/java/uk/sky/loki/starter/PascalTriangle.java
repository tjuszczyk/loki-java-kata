package uk.sky.loki.starter;

public class PascalTriangle {

    public static void main(String[] args) {
        long triangle = pascalsTriangle(150, 100);

        System.out.println(triangle);
    }

    public static long pascalsTriangle(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k < 0 || n < 0) {
            throw new IllegalArgumentException();
        } else if (k > n) {
            throw new IllegalArgumentException();
        } else {
            return (pascalsTriangle(n - 1, k - 1) + pascalsTriangle(n - 1, k));
        }
    }
}
