import java.util.*;
class candidates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int xT = sc.nextInt();
            int yT = sc.nextInt();
            int x =  sc.nextInt();
            int y = sc.nextInt();
            sc.nextLine();
            for (int j=0;j<xT;j++){
                // System.out.println("line");
                String problems = sc.nextLine();
                int len = problems.length();
                int f=0,p=0;
                while(len != 0){
                    char s = problems.charAt(len-1);
                    if(s == 'F'){
                        f++;
                    }
                    if(s == 'P'){
                        p++;
                    }
                    len--;
                }
                if(f >= x || ( f >= x-1 && p >= y )){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}