package Recursion;

public class SumOfDigits {
    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        if(n < 10){
            return n*n;
        }
        System.out.println((n%10) * (n%10));
        return (n%10 * n%10) + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(19%10 * 19%10);
        System.out.println(sumOfDigits(19));
    }
}
