public class TTTBoard {
    private static final int ROW = 3;
    private static final int COL = 3;
    private String[][] board;

    public TTTBoard() {
        board = new String[ROW][COL];
        clear();
    }

    public void clear() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                board[i][j] = " ";
            }
        }
    }

    public boolean isOccupied(int row, int col) {
        return !board[row][col].equals(" ");
    }

    public void setTile(int row, int col, String player) {
        board[row][col] = player;
    }

    public boolean isWin(String player) {
        for (int i = 0; i < ROW; i++) {
            if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
                return true;
            }
        }
        for (int j = 0; j < COL; j++) {
            if (board[0][j].equals(player) && board[1][j].equals(player) && board[2][j].equals(player)) {
                return true;
            }
        }
        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) {
            return true;
        }
        return board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player);
    }
}
