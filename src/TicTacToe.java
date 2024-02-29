public class TicTacToe {
    private static final int ROW = 3;
    private static final int COL = 3;
    private TTTBoard board;
    private String currentPlayer;
    private int moveCount;

    public TicTacToe() {
        board = new TTTBoard();
        currentPlayer = "X";
        moveCount = 0;
    }

    public boolean makeMove(int row, int col) {
        if (!board.isOccupied(row, col)) {
            board.setTile(row, col, currentPlayer);
            moveCount++;
            return true;
        }
        return false;
    }

    public boolean isWin() {
        return board.isWin(currentPlayer);
    }

    public boolean isTie() {
        return moveCount == ROW * COL;
    }

    public boolean isGameOver() {
        return isWin() || isTie();
    }

    public void reset() {
        board.clear();
        currentPlayer = "X";
        moveCount = 0;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
    }
}
