package string;

/**
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 *
 * 数字 1-9 在每一行只能出现一次。
 * 数字 1-9 在每一列只能出现一次。
 * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-sudoku
 */
public class IsValidSudoku {
    /**
     *
     * @param board =
     * [
     *   ["5","3",".",".","7",".",".",".","."],
     *   ["6",".",".","1","9","5",".",".","."],
     *   [".","9","8",".",".",".",".","6","."],
     *   ["8",".",".",".","6",".",".",".","3"],
     *   ["4",".",".","8",".","3",".",".","1"],
     *   ["7",".",".",".","2",".",".",".","6"],
     *   [".","6",".",".",".",".","2","8","."],
     *   [".",".",".","4","1","9",".",".","5"],
     *   [".",".",".",".","8",".",".","7","9"]
     * ]
     *
     * @return true
     */
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] col = new int[9][9];
        int[][] sbox = new int[9][9];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1'; //数
                    int index_box = (i / 3) * 3 + j / 3;//块
                    if (rows[i][num] == 1) { //在位置上放“1“,通过判断该位置是不是1来确定是否有重复值。 
                        return false;
                    } else {
                        rows[i][num] = 1; //没有放入"1"
                    }
                    if (col[j][num] == 1) {
                        return false;
                    } else {
                        col[j][num] = 1;
                    }
                    if (sbox[index_box][num] == 1) {
                        return false;
                    } else {
                        sbox[index_box][num] = 1;
                    }
                }
            }
        }
        return true;
    }
}
