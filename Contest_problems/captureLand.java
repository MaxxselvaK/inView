import java.util.*;
public class captureLand{
    public int countLand(int[][] land,int i,int j,int r,int c){
        if(i<r && i>=0 && j>=0 && j<c){
            if(land[i][j]==0){
                return 0;
            }
            land[i][j] = 0;
            return 1 + countLand(land,i-1,j,r,c) + countLand(land,i+1,j,r,c) + countLand(land,i,j-1,r,c) + countLand(land,i,j+1,r,c) ;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        captureLand cl = new captureLand();
        int[][] land = {{1,0,0,1},{0,1,1,0},{0,1,1,0},{1,0,0,1}};
        int r = land.length;
        int c = land[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(land[i][j] == 1){
                    int connected_components = cl.countLand(land,i,j,r,c);
                    list.add(connected_components);
                }
            }
        }
        Collections.sort(list);
        for(int i=list.size()-2;i>=0;i=i-2){
            System.out.println(list.get(i));
        }
    }
}