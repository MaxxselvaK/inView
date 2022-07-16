package DP;
//Not working properly
public class InterleavingString {
    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "axy";
        String str3 = "aaxaby";

        if( str1.length() + str2.length() < str3.length()){
            System.out.println("False");
        }else{
            System.out.println("isIT "+ isInterLeaving(str1,str2,str3));
        }

    }

    private static boolean isInterLeaving(String str1, String str2, String str3) {
        boolean[][] dp = new boolean[str1.length()+1][str2.length()+1];
        int row = str1.length()+1;
        int col = str2.length()+1;
        if(str1.length() + str2.length() < str3.length()){
            return false;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                int pos = i+j-1;

                if(i==0 && j==0){
                    dp[i][j] = true;
                    continue;
                }
                char curr_char = str3.charAt(pos);
                System.out.println(i+" "+j);
                if(i == 0 ){
                    if( curr_char == str1.charAt(j-1)){
                        dp[i][j] = dp[i][j-1];
                    }
                }else if(j == 0 ){
                    if( curr_char == str2.charAt(i-1)){
                        dp[i][j] = dp[i-1][j];
                    }
                }else{
//                    if(curr_char == str1.charAt(i-1)){
//                        dp[i][j] = dp[i-1][j];
//                    }
//
//                    if(curr_char == str2.charAt(j-1)){
//                        dp[i][j] = dp[i][j-1];
//                    }

                    dp[i][j] = (str1.charAt(i-1) == curr_char ? dp[i-1][j]:false) || (str2.charAt(j-1) == curr_char ? dp[i][j-1] : false );
                    // otherwise it will set to false
                }
            }
        }

        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println((row-1)+" "+(col-1));
        return dp[str1.length()][str2.length()];
    }
}
