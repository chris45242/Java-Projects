import javax.swing.*;

/**
 This program creates the TicTacToeFrame.
 */
public class TicTacToeRunner extends TicTacToeFrame
{
    public static void main(String[] args)
    {
        TicTacToeFrame ticTacToe = new TicTacToeFrame();
        ticTacToe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ticTacToe.setVisible(true);
    }
}
