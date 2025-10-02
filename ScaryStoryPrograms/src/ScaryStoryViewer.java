import javax.swing.*;

public class ScaryStoryViewer extends ScaryStoryProgramsFrame {

    public static void main(String[] args){

        ScaryStoryProgramsFrame scaryStoryProgramsFrame = new ScaryStoryProgramsFrame();
        scaryStoryProgramsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame imageFrame = new JFrame();
        imageFrame.setSize(100, 100);
        imageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scaryStoryProgramsFrame.setVisible(true);
    }
}
