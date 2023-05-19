import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class TheBoard extends JFrame implements ActionListener, ItemListener, ChangeListener {
    private JPanel mainPanel;
    private JButton a2PlayerButton;
    private JButton practice1PlayerButton;

    public TheBoard(){
        this.setContentPane(mainPanel);
        setSize(2900, 1200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Page");
        setVisible(true);
        a2PlayerButton.addActionListener(this);
        practice1PlayerButton.addActionListener(this);
    }

    synchronized public void timer(int seconds){
        try {
            System.out.println("Waiting");
            wait(seconds * 1000);
            System.out.println("Received");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized public void timeEnd(){
        notify();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        if(text.equals("2 Player")){
            timer(3);
            this.dispose();
            TwoPlayer gui = new TwoPlayer();
        }
        if(text.equals("Practice (1 Player)")){

        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
