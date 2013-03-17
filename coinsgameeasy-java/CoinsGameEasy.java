public class CoinsGameEasy {

	public int minimalSteps(String[] board) {
		int x = board[0].length();
		int y = board.length;
		int[][] board1 = new int[x+2][y+2];
		int[][] coins = new int[2][2];
		int a = 0;
		for(int i = 1;i < x + 1;i++){
			for(int j = 1;j < y + 1;j++){
				if(board[j - 1].indexOf(i - 1) =='.'){
					board1[i][j] = 0;
				}else if(board[j-1].indexOf(i-1) =='#'){
					board1[i][j] = 1;
				}else if(board[j-1].indexOf(i-1) =='o'){
					board1[i][j] = 0;
					int b = 0; 
					coins[a][b] = i;
					b++;
					coins[a][b] = j;
					a++;
				}
			}
		}
		return 0;
	}
	static void pushUp(int a[][]){
		a[0][1] = a[0][1] + 1;
		a[1][1] = a[1][1] + 1;
	}
	static void pushDown(int a[][]){
		a[0][1] = a[0][1] - 1;
		a[1][1] = a[1][1] - 1;
	}
	static void pushLeft(int a[][]){
		a[0][1] = a[0][0] - 1;
		a[1][1] = a[1][0] - 1;
	}
	static void pushRight(int a[][]){
		a[0][1] = a[0][0] + 1;
		a[1][1] = a[1][0] + 1;
	}
}
