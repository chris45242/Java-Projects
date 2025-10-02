import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TicTacToeFrame extends JFrame {

    private JButton quitButton, button, playAgainButton, b;
    private JTextField ticTacToeField;
    private JPanel panel, squaresPanel = new JPanel();
    private JLabel player1, player2;

    private ArrayList<JButton> squares;
    private JOptionPane pane = new JOptionPane();

    private static String crossPlayer = "Cross Player's turn!";
    private static String circlePlayer = "Circle Player's turn!";
    private static String crossPlayerWin = "Cross Player Win's";
    private static String circlePlayerWin = "Circle Player Win's";
    private static String currentPlayer = crossPlayer;
    private boolean done = false;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;

    private static final int ROWS = 3;
    private static final int COLUMNS = 3;

    private final int numberOfSquares = 9;

    private TicTacToe ticTacToe = null;

    public TicTacToeFrame(){

        super();
        ticTacToe = new TicTacToe();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Tic Tac Toe");
        this.setFont(new Font("BOLD", Font.BOLD, 12));
        ticTacToeSquares();
        ticTacToeSquaresPanel();
        createTextFields();
        createGameBoard();
        createGameRules();
    }

// Creates the Squares for the Tic Tac Toe game.
    private void ticTacToeSquares(){

        squares = new ArrayList<>();

        for(int i = 0; i < numberOfSquares; i++){
            JButton button = new JButton();
            button.setFont(button.getFont().deriveFont(18.0f));
            button.setPreferredSize(new Dimension(100, 100));
            ActionListener listener1 = new ClickListener();
            button.addActionListener(listener1);
            squaresPanel.add(button);
            squares.add(button);
        }
    }

// Creates the columns and rows for the Tic Tac Toe squares.
    private void ticTacToeSquaresPanel(){

        squaresPanel.setLayout(new GridLayout(ROWS, COLUMNS));
        add(squaresPanel);
    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            button = (JButton) event.getSource();

            for(int i = 0; i < numberOfSquares; i++){
                if(button.equals(squares.get(i))){
                    // Sets text to Cross Player's turn and allows them to input an X.
                    if (ticTacToeField.getText().equals(crossPlayer)) {
                        button.setText("X");
                        button.setEnabled(false);
                        ticTacToeField.setText(circlePlayer);
                        //ticTacToe.set();
                        if(i == 0){
                            ticTacToe.set(0,0,"X");
                        } else if (i == 1) {
                            ticTacToe.set(0, 1, "X");
                        } else if(i == 2){
                            ticTacToe.set(0, 2, "X");
                        } else if(i == 3){
                            ticTacToe.set(1, 0, "X");
                        } else if(i == 4){
                            ticTacToe.set(1, 1, "X");
                        } else if(i == 5){
                            ticTacToe.set(1, 2, "X");
                        } else if(i == 6){
                            ticTacToe.set(2, 0, "X");
                        } else if(i == 7){
                            ticTacToe.set(2, 1, "X");
                        } else if(i == 8){
                            ticTacToe.set(2, 2, "X");
                        }
                    }
                    // Sets text to Circle Player's turn if Cross player already put an X on a button.
                    else {
                        button.setText("O");
                        button.setEnabled(false);
                        ticTacToeField.setText(crossPlayer);
                        if(i == 0){
                            ticTacToe.set(0, 0, "O");
                        } else if(i == 1){
                            ticTacToe.set(0, 1, "O");
                        } else if(i == 2){
                            ticTacToe.set(0, 2, "O");
                        } else if(i == 3){
                            ticTacToe.set(1, 0, "O");
                        } else if(i == 4){
                            ticTacToe.set(1, 1, "O");
                        } else if(i == 5){
                            ticTacToe.set(1, 2, "O");
                        } else if(i == 6){
                            ticTacToe.set(2, 0, "O");
                        } else if(i == 7){
                            ticTacToe.set(2, 1, "O");
                        } else if(i == 8){
                            ticTacToe.set(2, 2, "O");
                        }
                    }
                    String t = ticTacToe.check();
                    if(t.equals(TicTacToe.NoWinnerYet)){
                    } else {
                        JOptionPane.showMessageDialog(panel, t);
                    }
                   //if(){
                    //pane.createDialog("Cross Player Wins!");

                    //JOptionPane.showMessageDialog(panel, "Circle Player Wins!");
                    // Is the buttons statement the individual squares in the frame.
                   //}
                }
            }

// Creates playAgainButton that gets rid of all X's and O's on all the buttons.
        playAgainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0; i < squares.size(); i++){
                    JButton b = squares.get(i);
                    ticTacToeField.setText(crossPlayer);
                    b.setText("");
                    b.setEnabled(true);
                    ticTacToe = new TicTacToe();
                }
            }
        });

// Creates quitButton that quits the game all together.
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
    }

    private void createTextFields()
    {
        ticTacToeField = new JTextField();
        ticTacToeField.setPreferredSize(new Dimension(100, 25));
    }

    private void createGameRules()
    {
        ticTacToeField.setText(crossPlayer);
    }

    private void createGameBoard()
    {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        quitButton = new JButton("Quit!");
        quitButton.setFont(new Font("TRUETYPE FONT", Font.TRUETYPE_FONT, 12));
        playAgainButton = new JButton("Play Again?");
        playAgainButton.setFont(new Font("ITALIC", Font.ITALIC, 12));
        panel.add(quitButton, BorderLayout.PAGE_END);
        panel.add(squaresPanel, BorderLayout.CENTER);
        panel.add(playAgainButton, BorderLayout.AFTER_LINE_ENDS);
        this.add(panel);
        panel.add(ticTacToeField, BorderLayout.PAGE_START);
        ActionListener listener = new ClickListener();
        quitButton.addActionListener(listener);
        ActionListener listener1 = new ClickListener();
        playAgainButton.addActionListener(listener1);
    }
}
