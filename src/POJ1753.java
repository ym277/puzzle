import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// POJ1753 Flip game: each time flip a chess and all the chess around it, finally make 
// all the chess the same color
public class POJ1753 {

	// ACM-ICPC problem: board of size 4, read a board of bw and
	// output the min number of flip or "impossible"
	// use brute-force
	public static void main(String[] args) throws IOException {

		// parse the std input
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
//		boolean[][] board= new boolean[4][4];
//		for (int i= 0; i < 4; i++ ) {
//			String s= reader.readLine();
//			char[] arr= s.toCharArray();
//			for (int j= 0; j < 4; j++ ) {
//				board[i][j]= arr[j] == 'b';
//			}
//		}

		System.out.println("h" == "h");
		String s= "h";
		String t= reader.readLine();
		System.out.println(s == t);

	}

	public static void dfs(boolean[][] board, int r, int c, int depth) {

	}

	// flip all chess centered at board[r][c]
	public static void flip(boolean[][] board, int r, int c) {
		board[r][c]^= true;
		if (r != 0) board[r - 1][c]^= true;
		if (r != 3) board[r + 1][c]^= true;
		if (c != 0) board[r][c - 1]^= true;
		if (c != 3) board[r][c + 1]^= true;
	}

	// check whether all chess have the same color
	public static boolean check(boolean[][] board) {
		for (int i= 0; i < 4; i++ ) {
			for (int j= 0; j < 4; j++ ) {
				if (board[i][j] != board[0][0]) return false;
			}
		}
		return true;
	}

}
