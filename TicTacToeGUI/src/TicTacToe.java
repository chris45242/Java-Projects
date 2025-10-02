public class TicTacToe
{
    // Need to create a 2D array Ex: 00 01 02
    //                               10 11 12
    //                               20 21 22
    // every time a button is clicked set that button equal to X or O.
    // Have a method to check for a winner and think about how I would do that.
    //int[][] board = new int[3][3];
    // if my

    private String[][] board;
    private static final int ROWS = 3;
    private static final int COLUMNS = 3;
    public static String CrossPlayerWins = "Cross Player Wins!";
    public static String CirclePlayerWins = "Circle Player Wins!";
    public static String Tie = "Tie!";
    public static String NoWinnerYet = "No Winner Yet!";
    private int moves;

    /**
     Constructs an empty board.
     */
    public TicTacToe()
    {
        board = new String[ROWS][COLUMNS];
        // Fill with spaces
        moves = 0;
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    /**
     Sets a field in the board. The field must be unoccupied.
     @param i the row index
     @param j the column index
     @param player the player ("x" or "o")
     */
    public void set(int i, int j, String player)
    {
        if (board[i][j].equals(" ")){
            board[i][j] = player;
            moves++;
        }
    }
    public String check(){

        if(board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X") ||
                board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X") ||
                board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X") ||
                board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X") ||
                board[0][2].equals("X") && board[1][1].equals("X") && board[2][0].equals("X") ||
                board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X") ||
                board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X") ||
                board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X")){
           return CrossPlayerWins;
        }
        if(board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O") ||
                board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O") ||
                board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O") ||
                board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O") ||
                board[0][2].equals("O") && board[1][1].equals("O") && board[2][0].equals("O") ||
                board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O") ||
                board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O") ||
                board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O")){
            return CirclePlayerWins;
        }
        if (moves == 9) {
            return Tie;
        }
        return NoWinnerYet;
    }
}
