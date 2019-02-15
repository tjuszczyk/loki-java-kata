package uk.sky.loki.starter;

public class PascalTriangle {

    public void main(String[] args) {
        long triangle = pascalsTriangle(150, 100);
        System.out.println(triangle);
    }

    public long pascalsTriangle(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k < 0 || n < 0) {
            throw new IllegalArgumentException();
        } else if (k > n) {
            throw new IllegalArgumentException();
        } else {
            int numerator = calculateFactorial(n);
            int denominator = calculateFactorial(k) * calculateFactorial(n-k);
            return numerator/denominator;
        }
    }

    private int calculateFactorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
}