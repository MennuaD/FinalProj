import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class TheBoard extends JFrame {
    private JPanel mainPanel;
    private JButton a2PlayerButton;
    private JButton practice1PlayerButton;
    private JTextArea textArea1;

    public TheBoard(){
        this.setContentPane(mainPanel);
        setSize(700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");
        setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
