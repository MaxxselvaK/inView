package Recursion;

public class DecimalToBinary {
    static int decToBinary(int n){

        if(n == 0){
            return 0;
        }
        return n%2 + 10 * decToBinary(n/2);
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(decToBinary(19));
    }
}
