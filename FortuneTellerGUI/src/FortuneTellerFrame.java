import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FortuneTellerFrame extends JFrame{

    private JButton readMyFortuneButton, quitButton;
    private JTextArea fortuneArea;
    private JLabel label, imageLabel;
    private JScrollPane scrollPane;
    private JPanel panel;
    private String fortuneAppeared;
    private Random randomFortune = new Random();

    ArrayList<String> fortunes = new ArrayList<>();
    ImageIcon image = new ImageIcon("fortune teller.jpg");
    int oldFortune;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 600;

    private static final int AREA_ROWS = 12;
    private static final int AREA_COLUMNS = 20;

    private static final int IMAGE_WIDTH = 36;
    private static final int IMAGE_HEIGHT = 48;

    public FortuneTellerFrame(){

        super();
        oldFortune = -1;
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        createComponents();
        loadFortunes();
        fortuneAppeared = "";
    }

    private void loadFortunes() {
        fortunes.add("This program deserves an A.");
        fortunes.add("No snowflake in an avalanche ever feels responsible.");
        fortunes.add("If you eat something & nobody sees you eat it, it has no calories.");
        fortunes.add("The road to riches is paved with homework.");
        fortunes.add("You don't have to be faster than the bear, you just have to be faster than the slowest guy running from it.");
        fortunes.add("Fortune not found? Abort, retry, ignore.");
        fortunes.add("It is a good day to have a good day.");
        fortunes.add("All fortunes are wrong except this one.");
        fortunes.add("You can always find happiness at work on Friday.");
        fortunes.add("Flattery will go far tonight.");
        fortunes.add("If you look back, you'll soon be going that way.");
        fortunes.add("The fortune you seek is in another cookie.");
    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
        readMyFortuneButton = (JButton) event.getSource();
        int f = randomFortune.nextInt(12);
        if (f == oldFortune){
            f = randomFortune.nextInt(12);
        }
        oldFortune = f;
        fortuneAppeared = fortuneAppeared + fortunes.get(f) + "\n";
        fortuneArea.append(fortuneAppeared);
        fortuneArea.setText(fortuneAppeared);
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        }
    }
    private void createComponents(){

        // Top Panel
        this.setTitle("Fortune Teller");
        this.setFont(new Font("BOLD", Font.ITALIC, 12));
        label = new JLabel("Fortune Teller");
        label.setFont(new Font("Courier New", Font.ITALIC, 12));
        JLabel fortuneImagelabel = new JLabel(image);
        JScrollPane imageScroll = new JScrollPane(fortuneImagelabel);
        imageScroll.setAlignmentY(BOTTOM_ALIGNMENT);

        // Middle Panel
        fortuneArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        scrollPane = new JScrollPane(fortuneArea);
        fortuneArea.setEditable(false);

        // Bottom Panel
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        readMyFortuneButton = new JButton("Read My Fortune!");
        readMyFortuneButton.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 12));
        quitButton = new JButton("Quit!");
        quitButton.setFont(new Font("TRUETYPE_FONT", Font.TRUETYPE_FONT, 12));
        panel.add(readMyFortuneButton, BorderLayout.NORTH);
        panel.add(quitButton, BorderLayout.PAGE_END);
        this.add(panel);
        panel.add(label, BorderLayout.LINE_START);
        panel.add(fortuneImagelabel, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.LINE_END);

        ActionListener listener = new ClickListener();
        readMyFortuneButton.addActionListener(listener);
        ActionListener listener1 = new ClickListener();
        quitButton.addActionListener(listener1);
    }
}

