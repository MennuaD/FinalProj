import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


public class TwoPlayer extends JFrame implements ActionListener, ItemListener, ChangeListener {

        private JPanel namePanel;
        private JTextField enterPlayer1STextField;
        private JTextField enterPlayer2STextField;
    private JButton player1ReadyButton;
    private JButton player2ReadyButton;
    private JCheckBox checkBox1;
    private JPanel checkBox2;
    private JLabel Yuuki;

    private JLabel jLabel;

    static int condition = 1;

    private Images use = new Images();

    private ImageIcon yuukiUp = use.getYuukiUp();

    private ImageIcon yuukiDown = use.getYuukiDown();

    private Image YuukiUp = yuukiUp.getImage();

    private Image YuukiDown = yuukiDown.getImage();


    public TwoPlayer() {
        this.setContentPane(namePanel);
        setSize(1400, 700);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Name Panel");
        setVisible(true);
        player1ReadyButton.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();
        if (text.equals("Player1 Ready")){

         if (condition == 1){
             Yuuki.setIcon(yuukiDown);
             condition = 2;
         } else if (condition == 2) {
             Yuuki.setIcon(yuukiUp);
             condition = 1;
         }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}