package misc;

public class first {
    public static void main(String[] args) {
        char[] chars = "The domestic dog is a domesticated form of wolf".toLowerCase().toCharArray();
        char[] output = new char[chars.length+5];
        int len = chars.length;
        int op = 0;
        for(int i=97;i<=122;i++){
            for(int i1=0;i1<len;i1++){
                if(chars[i1] == (char)i){
                    while( op< len && i1 < len && chars[i1] != ' '){
                        output[op] = chars[i1];
                        System.out.print(chars[i1]);
                        i1++;
                        op++;
                    }
//                    System.out.println(op);
                    output[op++] = ' ';
//                    op++;
                }else{
                    while( i1 < len && chars[i1] == ' '){
                        i1++;
                    }
                    i1++;
                }
            }
        }
        System.out.println(output);
    }
}
