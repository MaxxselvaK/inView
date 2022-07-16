package Recursion;

public class GCD {
    static int findGCD(int a, int b){
        if(a == b){ // base case
            return a;
        }

        if( a > b){
            return findGCD(a-b,a); // avoid negative value a is greater
        }else{
            return findGCD(a, b-a); // b is greater
        }
    }

    public static void main(String[] args) {
        System.out.println(findGCD(42,56));
    }
}
