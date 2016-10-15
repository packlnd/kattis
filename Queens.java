import java.util.Arrays;

public class Queens {
  public static void main(String[] args) {
  	int[] queenRowForCol = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
  	recurse(queenRowForCol, 0);
  }

  private static void printBoard(int[] queenRowForCol) {
    System.out.println();
    for (int i=0; i<8; ++i) {
      char[] c = new char[]{'-','-','-','-','-','-','-','-'};
      if (queenRowForCol[i] == -1) continue;
      c[queenRowForCol[i]] = 'X';
      System.out.println(Arrays.toString(c));
    }
  }

  private static boolean checkIfPositionAvailable(int row, int col, int[] queenRowForCol) {
    for (int col2=0; col2<col; ++col2) {
      int row2 = queenRowForCol[col2];
      int deltaCol = col - col2;
      int deltaRow = Math.abs(row - row2);
      if (row2 == row || deltaRow == deltaCol) return false;
    }
    return true;
  }

  private static void recurse(int[] queenRowForCol, int col) {
    //printBoard(queenRowForCol);
  	if (col == 8) {
      printBoard(queenRowForCol);
  		return;
  	}
  	for (int row=0; row<8; ++row) {
  		if (checkIfPositionAvailable(row, col, queenRowForCol)) {
  			queenRowForCol[col]=row;
  			recurse(queenRowForCol, col+1);
      }
    }
    queenRowForCol[col] = -1;
  }
}
