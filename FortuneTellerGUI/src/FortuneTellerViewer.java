import javax.swing.*;

public class FortuneTellerViewer extends FortuneTellerFrame{

    public static void main(String[] args){

        FortuneTellerFrame fortuneFrame = new FortuneTellerFrame();
        fortuneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame imageFrame = new JFrame();
        imageFrame.setSize(100, 100);
        imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // JComponent component = new fortuneTellerComponent();
        fortuneFrame.setVisible(true);
    }
}
