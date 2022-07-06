//$Id$
package backtracking_micro_course;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		int[][] board = new int[n][n];
		placeQueens(0,n,board);
	}

	private static void placeQueens(int current_row, int noOfQueens, int[][] board) {
		
		if(noOfQueens == 0) {
			printBoard(board);
			System.out.println("==============");
			return;
		}
//		System.out.println("invoked");
		for(int col = 0;col <board.length;col++) {
//			System.out.println(isSafe(current_row,col,board) + " "+ current_row+" "+ col );
			if(isSafe(current_row,col,board)) {
				
				// do
				board[current_row][col] = 1;
				
				// recurse
				placeQueens(current_row+1,noOfQueens - 1,board);
				
				// undo
				board[current_row][col] = 0;
			}
		}
		
	}

	private static void printBoard(int[][] board) {
		// TODO Auto-generated method stub
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static boolean isSafe(int current_row, int col, int[][] board) {
		// vertically up
		int row = current_row - 1;
		for(int i=row;i>=0;i--) {
			if(board[i][col] == 1) {
				return false;
			}
		}
		// horizontally left
		int c = col -1;
		while(c >= 0) {
			if(board[current_row][c] == 1) {
				return false;
			}
			c--;
		}
		// diagonally left
		int d_row = current_row - 1;
		int d_col = col - 1;
		while(d_col >= 0 && d_row >= 0) {
			if(board[d_row][d_col] == 1) {
				return false;
			}
			d_col--;
			d_row--;
		}
		
		// diagonally right
		int dd_row = current_row - 1;
		int dd_col = col+1;
		while(dd_row >= 0 && dd_col < board.length) {
			if(board[dd_row][dd_col] == 1) {
				return false;
			}
			dd_row--;
			dd_col++;
		}
		return true;
	}

}
