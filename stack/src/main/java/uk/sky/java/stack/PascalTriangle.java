package uk.sky.java.stack;

public class PascalTriangle {

    long pascal(int n, int k){
        System.out.println("n="+n+",k="+k);
        if(k==0||n==k){
            return 1;
        }
        return pascal(n-1,k-1)+pascal(n-1,k);
    }
}
