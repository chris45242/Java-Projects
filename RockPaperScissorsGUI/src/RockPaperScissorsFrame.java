import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperScissorsFrame extends JFrame {

    private ImageIcon rockImage, paperImage, scissorsImage;
    private JPanel panel, panel1, panel2, panel3;
    private JButton rockButton, paperButton, scissorsButton, quitButton;
    private JTextArea eachResultArea;
    private JScrollPane eachResultPane;
    private JTextField rockPaperScissorsTextField, playerWinCounter, computerWinCounter, tieWinCounter;
    private JLabel playerWinCounterLabel, computerWinCounterLabel, tieWinCounterLabel;
    private String ImageAppeared;
    private String winnerText;
    private int numberOfPlayerWins, numberOfComputerWins, numberOfTies;

    private static String playerWins1 = "Paper covers Rock - Player Wins!";
    private static String playerWins2 = "Rock breaks Scissors - Player Wins!";
    private static String playerWins3 = "Scissors cuts Paper - Player Wins!";
    private static String computerWins1 = "Paper covers Rock - Computer Wins!";
    private static String computerWins2 = "Rock breaks Scissors - Computer Wins!";
    private static String computerWins3 = "Scissors cuts Paper - Computer Wins!";
    private static String tie = "It's a Tie!";

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;

    private static final int FIELD_WIDTH = 2;

    private static final int AREA_ROWS = 12;
    private static final int AREA_COLUMNS = 20;

    private final static int ROCK = 0;
    private final static int PAPER = 1;
    private final static int SCISSORS = 2;

    private int playerChoice;
    private int computerChoice;

    Random random;

    public RockPaperScissorsFrame(){

        super();
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        random = new Random();
        createGameBoard();
        createGameWinConditions();
        numberOfPlayerWins = 0;
        numberOfComputerWins = 0;
        numberOfTies = 0;
        //playGame();
        winnerText = "";
        ImageAppeared = "";
    }

    private void createGameWinConditions()
    {

    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            //JButton pressedButton = (JButton) event.getSource();

    }
    }

    private void playGame(int choice)
    {
        playerChoice = choice;
        computerChoice = random.nextInt(3);
        decideGameWinner();
    }

    private void decideGameWinner()
    {
        // If player chose ROCK and computer chose PAPER.

        if (playerChoice == ROCK) {
            // If player chose ROCK and computer chose ROCK.
            if (computerChoice == ROCK)
            {
                rockPaperScissorsTextField.setText(tie);
                winnerText = winnerText + tie + "\n";
                eachResultArea.setText(winnerText);
                numberOfTies++;
                tieWinCounter.setText(String.valueOf(numberOfTies));
            }
            // if player chose ROCK and computer chose SCISSORS.
            else if (computerChoice == SCISSORS)
            {
                rockPaperScissorsTextField.setText(playerWins2);
                winnerText = winnerText + playerWins2 + "\n";
                eachResultArea.setText(winnerText);
                numberOfPlayerWins++;
                playerWinCounter.setText(String.valueOf(numberOfPlayerWins));
            }
            // If player chose ROCK and computer chose PAPER.
            else if (computerChoice == PAPER)
            {
                rockPaperScissorsTextField.setText(computerWins1);
                winnerText = winnerText + computerWins1 + "\n";
                eachResultArea.setText(winnerText);
                numberOfComputerWins++;
                computerWinCounter.setText(String.valueOf(numberOfComputerWins));
            }
        }
        else if (playerChoice == PAPER)
        {
            // If player chose PAPER and computer chose PAPER.
            if (computerChoice == PAPER)
            {
                rockPaperScissorsTextField.setText(tie);
                winnerText = winnerText + tie + "\n";
                eachResultArea.setText(winnerText);
                numberOfTies++;
                tieWinCounter.setText(String.valueOf(numberOfTies));
            }
            // If player chose PAPER and computer chose SCISSORS.
            if (computerChoice == SCISSORS)
            {
                rockPaperScissorsTextField.setText(computerWins3);
                winnerText = winnerText + computerWins3 + "\n";
                eachResultArea.setText(winnerText);
                numberOfComputerWins++;
                computerWinCounter.setText(String.valueOf(numberOfComputerWins));
            }
            // If player chose PAPER and computer chose ROCK.
            if (computerChoice == ROCK)
            {
                rockPaperScissorsTextField.setText(playerWins1);
                winnerText = winnerText + playerWins1 + "\n";
                eachResultArea.setText(winnerText);
                numberOfPlayerWins++;
                playerWinCounter.setText(String.valueOf(numberOfPlayerWins));
            }
        }
        else if (playerChoice == SCISSORS)
        {
            // if player chose SCISSORS and computer chose SCISSORS.
            if (computerChoice == SCISSORS)
            {
                rockPaperScissorsTextField.setText(tie);
                winnerText = winnerText + tie + "\n";
                eachResultArea.setText(winnerText);
                numberOfTies++;
                tieWinCounter.setText(String.valueOf(numberOfTies));
            }
            // If player chose SCISSORS and computer chose PAPER.
            if (computerChoice == PAPER)
            {
                rockPaperScissorsTextField.setText(playerWins3);
                winnerText = winnerText + playerWins3 + "\n";
                eachResultArea.setText(winnerText);
                numberOfPlayerWins++;
                playerWinCounter.setText(String.valueOf(numberOfPlayerWins));
            }
            // If player chose SCISSORS and computer chose ROCK.
            if (computerChoice == ROCK)
            {
                rockPaperScissorsTextField.setText(computerWins2);
                winnerText = winnerText + computerWins2 + "\n";
                eachResultArea.setText(winnerText);
                numberOfComputerWins++;
                computerWinCounter.setText(String.valueOf(numberOfComputerWins));
            }
        }
    }

    private void createGameBoard()
    {
        this.setTitle("Rock Paper Scissors Game");
        ImageIcon rockImage = new ImageIcon("Rock.png");
        ImageIcon paperImage = new ImageIcon("Paper.png");
        ImageIcon scissorsImage = new ImageIcon("Scissors.png");
        rockButton = new JButton("Rock");
        rockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame(ROCK);
            }
        });
        //rockButton.setContentAreaFilled(false);
        paperButton = new JButton("Paper");
        paperButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame(PAPER);
            }
        });
        scissorsButton = new JButton("Scissors");
        scissorsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                playGame(SCISSORS);
            }
        });
        quitButton = new JButton("Quit!");
        quitButton.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 12));
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(3, 1));
        panel1.setPreferredSize(new Dimension(150, 20));
        rockButton.setIcon(rockImage);
        panel1.add(rockButton);
        paperButton.setIcon(paperImage);
        panel1.add(paperButton);
        scissorsButton.setIcon(scissorsImage);
        panel1.add(scissorsButton);

        /**ImageIcon paperImage = new ImageIcon("Paper.png");
        JLabel paperImageLabel = new JLabel(paperImage);
        JButton paperButton = new JButton(paperImage);
        JScrollPane paperScroll = new JScrollPane(paperImageLabel);
        paperScroll.setAlignmentY(CENTER_ALIGNMENT);
        ImageIcon rockImage = new ImageIcon("Rock.png");
        JLabel rockImageLabel = new JLabel(rockImage);
        JScrollPane rockScroll = new JScrollPane(rockImageLabel);
        rockScroll.setAlignmentY(CENTER_ALIGNMENT);
        rockImageLabel.setVisible(true);
        ImageIcon scissorsImage = new ImageIcon("Scissors.png");
        JLabel scissorsImageLabel = new JLabel(scissorsImage);
        JScrollPane scissorsScroll = new JScrollPane(scissorsImageLabel);
        scissorsScroll.setAlignmentY(CENTER_ALIGNMENT);*/

        eachResultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        eachResultPane = new JScrollPane(eachResultArea);
        eachResultArea.setEditable(false);
        rockPaperScissorsTextField = new JTextField();
        rockPaperScissorsTextField.setEditable(false);
        playerWinCounter = new JTextField(FIELD_WIDTH);
        playerWinCounter.setEditable(false);
        computerWinCounter = new JTextField(FIELD_WIDTH);
        computerWinCounter.setEditable(false);
        tieWinCounter = new JTextField(FIELD_WIDTH);
        tieWinCounter.setEditable(false);

        JPanel playerWinCounterPanel = new JPanel();
        playerWinCounterLabel = new JLabel("Times Player has Won");
        playerWinCounterPanel.add(playerWinCounterLabel);
        playerWinCounterPanel.add(playerWinCounter);
        JPanel computerWinCounterPanel = new JPanel();
        computerWinCounterLabel = new JLabel("Times Computer has Won");
        computerWinCounterPanel.add(computerWinCounterLabel);
        computerWinCounterPanel.add(computerWinCounter);
        JPanel tieWinCounterPanel = new JPanel();
        tieWinCounterLabel = new JLabel("Ties");
        tieWinCounterPanel.add(tieWinCounterLabel);
        tieWinCounterPanel.add(tieWinCounter);
        JPanel allWinsCounterPanel = new JPanel();
        allWinsCounterPanel.add(playerWinCounterPanel);
        allWinsCounterPanel.add(computerWinCounterPanel);
        allWinsCounterPanel.add(tieWinCounterPanel);

        panel.add(quitButton, BorderLayout.PAGE_END);
        panel.add(rockPaperScissorsTextField, BorderLayout.PAGE_START);
        panel.add(panel1, BorderLayout.WEST);
        panel.add(eachResultPane, BorderLayout.EAST);
        panel.add(allWinsCounterPanel, BorderLayout.CENTER);
        //panel.add(computerWinCounterPanel, BorderLayout.CENTER);
        this.add(panel);

        ActionListener listener = new ClickListener();

    }
}
