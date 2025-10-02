import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;

public class ScaryStoryProgramsFrame extends JFrame {

    private JPanel panel, panel1;
    private JTextArea scaryStoryArea;
    private JTextField introductionTextField;
    private JScrollPane scrollPane;
    private JLabel label;
    private Random randomScaryStory = new Random();
    private JButton tellAStoryButton, quitButton;
    private String scaryStoryAppeared;

    ArrayList<String> scaryStories = new ArrayList<>();
    ImageIcon image = new ImageIcon("dr-dark-adventures-of-jimmy-neutron-boy-genius-9.65.jpg");
    int oldScaryStory;

    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;

    private static final int AREA_ROWS = 12;
    private static final int AREA_COLUMNS = 20;

    public ScaryStoryProgramsFrame()
    {
        super();
        oldScaryStory = -1;
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        loadScaryStories();
        createComponents();
    }

    private void loadScaryStories()
    {
        scaryStories.add("          The Black Dog of NewGate\nThe Black dog of Newgate has been \nsaid to haunt the Newgate Prison for \nover 400 years appearing before \nexecutions." +
                " According to legend, in 1596\n a scholar was sent to the prison for \nwitchcraft, but was killed and eaten by \nstarving prisoners before he was given a \ntrial." +
                " The dog was said to appear soon \nafter, and although the terrified men \nkilled their guards and escaped, the \nbeast is said to have hunted them down \nand killed them whereever they fled." +
                " \nGrim (or Fairy Grim) is the name of a \nshapeshifting fairy that sometimes took \nthe form of a black dog in the 17th \ncentury pamphlet The Mad Pranks and \nMerry Jests of Robin Goodfellow." +
                " He \nwas also referring to as the Black Dog of \nNewgate, but though he enjoyed \nfrightening people he never did any \nserious harm.");

        scaryStories.add("                   No Thanks\nOn Thursday nights, a boy named Jim \nhad to work late at the local \nsupermarket." +
                "He worked as a stock \nboy in one of the malls outside of \ntown and was often the last one to leave. \nBy eight-thirty his work was finished." +
                " He \nlocked up the store and made his way \nhome. By the time he got out to the huge \nparking lot, it was almost empty." +
                " The \nonly sound he could hear was the echo \nof his own footsteps on the pavement. \nAs Jim walked down a deserted \nalleyway, he heard a strange rustling \nsound." +
                " Suddenly a man stepped out of \nthe shadows. His face was misshapen \nand deformed. Hey Kid over here he \ncalled in a low voice." +
                " The man held out \nhis right hand. He was holding a long, \nthin knife. The razor sharp blade glinted \nin the dim light. Jim stopped in his \ntracks. Nice, sharp knife the man said \nsoftly." +
                " Don't panic, Jim told himself. He \nwas shaking in his boots. The man took \na few steps toward him and smiled, \nrevealing a row of rotten teeth. Don't run, \nJim told himself. Just stay calm." +
                " Nice, \nsharp knife, the man repeated. Just give \nhim what he wants, Jim thought. \nThen he'll let you go. The man came \ncloser. He held the knife up. Cuts \nnice and easy, he said slowly." +
                " Jim \ntried to stop himself from screaming \nout loud. The man peered into his \nface. Hey kid, you wanna buy a knife? \nOnly three dollars. Two for five. It'll \nmake a nice present for your mother." +
                " \nNo thanks, Jim said. She's already \ngot one. And he ran away as fast as \nhis legs would carry him.");

        scaryStories.add("                    The BabySitter\nThere was a young girl who was in need \nof a job and was able to find work as a \nbabysitter for a couple who lived in a \nlarge, isolated, old house." +
                " They were \ngoing out to see a movie that night and \nleft the teenage baby-sitter in charge of \ntheir three young children." +
                " The \nbabysitter put the children to bed when it \ngot late and then went downstairs to \nwatch some television." +
                " She was just \ngetting comfortable when she heard the \nphone ringing. When she answered it, \nall she heard was heavy breathing \nfollowed by a man's voice asking, have \nyou checked on the children?" +
                " Freaked \nout, she hung up the phone, trying to \nconvince herself that it was just \nsomeone playing a practical joke on her." +
                " \nShe went back to watching television, \nbut about 15 minutes later, the phone \nrang again. She picked up the receiver \nand heard hysterical laughter from the \nother end of the line." +
                " Then the same \nvoice asked, why haven't you checked on \nthe children? The babysitter slammed \ndown the phone. The poor girl was \nfrightened out of her wits and \nimmediately called the police." +
                " The \noperator at the police station told the \nbabysitter that if the man called again, \nshe should try to keep him talking. \nThat would give the police time to \ntrace the call." +
                " A few minutes later, the \nphone rang a third time and when the \nbabysitter answered it, she heard the \nheavy breathing again. The voice on \nthe line said, you should really check \non the children." +
                " The babysitter \nlistened to him laughing hysterically \nfor a long time. She hung up the \nphone again and almost immediately, \nit rang again." +
                " This time it was the \noperator from the police station who \nyelled, GET OUT OF THE HOUSE \nRIGHT NOW! THE CALLS ARE \nCOMING FROM THE UPSTAIRS \nPHONE!" +
                " The babysitter dropped the \nphone in shock and suddenly she \nheard heavy footsteps walking down \nthe stairs. Without pausing for a \nsecond, she ran out of the house as \nfast as her legs would carry her." +
                " Just \nas she closed the front door behind \nher, a man's hand slammed against \nthe glass. She screamed and ran out \ninto the street just as a police car was \npulling up outside." +
                " The police \nsearched the house and found the \ntwo children upstairs, hiding in a \ncloset crying uncontrollably. In the \nparents bedroom, they found a bloody \naxe lying on the floor next to the \nupstairs phone." +
                " The back window \nwas wide open and the curtains were \nblowing in the breeze. There was no \nsign of the madman who had made \nthe phone calls." +
                " He had escaped into \nthe night when the police arrived and \nmanaged to interrupt his horrible plan \nto kill the two children and the poor \nbabysitter.");

        scaryStories.add("                   Something Was Wrong\nOne morning, man found himself \nwalking along a deserted street in a \nsmall town." +
                " He had no idea what he was \ndoing there or how he got there in the \nfirst place, or where he had been earlier. \nHe didn't even know what time it was." +
                " \nHe saw a woman walking toward him \nand stopped her. I'm afraid I forgot my \nwatch, he said with a polite smile. Can \nyou please tell me the time?" +
                " When the \nwoman saw him, she screamed and \nran away. The man was shocked. A few \nminutes later, he noticed that other \npeople were afraid of him too." +
                " Whenever \nthey saw him coming, they flattened \nthemselves against a building, recoiled \nin horror or ran across the street to stay \nout of his way." +
                " There must be something \nwrong with me, thought the man. I'd \nbetter go home as soon as possible. " +
                " \nHe hailed a taxi, but when the taxi driver \nlaid eyes on him, he floored the \naccelerator and sped away. This is crazy! \nthe man said to himself." +
                " He couldn't \nfigure out what was wrong and had no \nidea what was going on. All he knew \nwas that he was scared and confused." +
                " \nMaybe my wife can come pick me up, he \nthought. He found a telephone and \ncalled home, expecting to hear his \nwife's sweet voice. Instead, a strange \nvoice answered." +
                " Is Mrs Sullivan \nthere? he asked. I'm sorry, she isn't, \nthe voice said. Her husband died a \nfew days ago in a horrible car crash \nand she's attending his funeral.");

        scaryStories.add("I heard this one from regulars at a \ncertain shop on moonlit nights just like \nthis one." +
                " Legend has it that three girls, \nall best friends, played every game they \ncould together. They were inseparable." +
                " \nThey leveled together, quested together, \nbought and sold items together. But one \nday, they all logged on, and a member \nof their party didn't show." +
                " They waited \nhours, but her user never appeared. \nEarlier that day, tragedy struck and that \ngirl had died in a tragic car accident." +
                " \nUnaware of what had happened, the \nother girls waited and waited and waited \nfor their friend to arrive." +
                " Eventually they \ngave up, figured something must have \ngotten in the way of gaming that day, \nand went off to quest on their own." +
                " When \nthey finished playing, they went back to \nthe inn to log out, but... something felt \nwrong. The cost of the room, was the \nprice for three..." +
                " A crackly voice \nspoke from behind them, whispering in \ntheir ears like the sound of rustling \nleaves... Can... I... Play... Now...?");
    }

    class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event){
            tellAStoryButton = (JButton) event.getSource();
            int s = randomScaryStory.nextInt(5);
            if (s == oldScaryStory){
                s = randomScaryStory.nextInt(5);
            }
            oldScaryStory = s;
            scaryStoryAppeared = scaryStories.get(s) + "\n";
            scaryStoryArea.append(scaryStoryAppeared);
            scaryStoryArea.setText(scaryStoryAppeared);
            quitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {System.exit(0);}
            });
        }
    }

    private void createComponents()
    {
        this.setTitle("Scary Stories");
        this.setFont(new Font("BOLD", Font.ITALIC, 12));

        tellAStoryButton = new JButton("Tell a Scary Story");
        tellAStoryButton.setFont(new Font("ROMAN BASELINE", Font.ROMAN_BASELINE, 12));
        quitButton = new JButton("Quit");
        quitButton.setFont(new Font("TRUETYPE FONT", Font.TRUETYPE_FONT, 12));
        JLabel imageLabel = new JLabel(image);
        JScrollPane imageScroll = new JScrollPane(imageLabel);
        imageScroll.setAlignmentY(BOTTOM_ALIGNMENT);

        introductionTextField = new JTextField();
        introductionTextField.setPreferredSize(new Dimension(100, 25));
        introductionTextField.setText("Good evening, I am Dr.Dark, Teller of Terrible Tales.");
        introductionTextField.setEditable(false);
        scaryStoryArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        scrollPane = new JScrollPane(scaryStoryArea);
        scaryStoryArea.setEditable(false);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(introductionTextField);
        panel1.add(tellAStoryButton);
        panel.add(imageScroll, BorderLayout.CENTER);
        panel.add(scrollPane, BorderLayout.LINE_END);
        panel.add(quitButton, BorderLayout.PAGE_END);
        panel.add(panel1, BorderLayout.NORTH);
        this.add(panel);

        ActionListener listener = new ClickListener();
        tellAStoryButton.addActionListener(listener);
        ActionListener listener1 = new ClickListener();
        quitButton.addActionListener(listener1);
    }
}
