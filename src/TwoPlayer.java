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



public class TwoPlayer extends JFrame implements ActionListener, ItemListener, ChangeListener {

        private JPanel namePanel;
        private JTextField enterPlayer1STextField;
        private JTextField enterPlayer2STextField;
    private JButton button1;
    private JButton button2;

    public TwoPlayer(){
        this.setContentPane(namePanel);
        setSize(1400, 700);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Name Panel");
        setVisible(true);
       // a2PlayerButton.addActionListener(this);
       // practice1PlayerButton.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        /*if(text.equals("2 Player")){
            textArea1.setText("2 player selected!");
            TwoPlayer gui = new TwoPlayer();
        }
        if(text.equals("Practice (1 Player)")){
            textArea1.setText("Practice(1 Player) selected!");
        }*/
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}