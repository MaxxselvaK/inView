package backtracking_micro_course;

public class ratInMaze {
    static int[] rowOff = {0,1,0,-1};
    static int[] colOff = {1,0,-1,0};
    public static void main(String[] args) {
        int[][] maze = new int[][]{{1,0,0,0},
                {1,1,0,1},
                {0,1,0,0},
                {1,1,1,1}};
        solve(maze);
    }

    private static void solve(int[][] maze) {
        int[][] ans = new int[maze.length][maze[0].length];
        if(solveMaze(maze,ans,0,0)){
            System.out.println("Valid Path found");
        }else{
            System.out.println("No valid path found");
        }
    }

    private static boolean solveMaze(int[][] maze, int[][] ans, int row, int col) {

        if(row == maze.length-1 && col == maze[0].length-1 ){
            ans[row][col] = 1;
            return true;
        }
        if(row >= maze.length || col >= maze[0].length || maze[row][col] == 0){
            return false;
        }
        // already visited
        if(ans[row][col] == 1){
            return false;
        }
        // do
        if(maze[row][col] == 1)
            ans[row][col] = 1;
        // recurse
        for(int i=0;i<rowOff.length;i++){
            if(row+rowOff[i]>=0 && row+rowOff[i] < maze.length && col+colOff[i] < maze[0].length && col+colOff[i] >=0){
                if(solveMaze(maze,ans,row+rowOff[i],col+colOff[i])){
                    return true;
                }
            }
        }
        // backtrack
        ans[row][col] = 0;
        return false;
    }
}
