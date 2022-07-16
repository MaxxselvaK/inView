package Recursion;

public class Prime {
    static boolean isPrime(int n,int i){
        if(n < 2){
            return false;
        }
        if(i == 1){
            return true;
        }
        if(n%i == 0){
            return false;
        }else{
            return isPrime(n,i-1);
        }
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n,n/2));
    }
}
