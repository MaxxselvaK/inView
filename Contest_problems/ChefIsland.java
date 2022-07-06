
import java.util.*;
class ChefIsland{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int xT = sc.nextInt();
            int yT = sc.nextInt();
            int x =  sc.nextInt();
            int y = sc.nextInt();
            int d = sc.nextInt();

            if(x*d <= xT && y*d <= yT){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}