import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class OnePlayer extends JFrame implements ActionListener, ItemListener, ChangeListener {

        private JPanel namePanel;
        private JTextField enterPlayer1STextField;
    private JButton player1ReadyButton;
    private JCheckBox readyBox;
    private JPanel checkBox2;
    private JLabel character;
    private JLabel Yuuki;

    private JLabel jLabel;

    static int condition = 1;

    private Images use = new Images();

    private ImageIcon yuukiUp = use.getYuukiUp();

    private ImageIcon yuukiDown = use.getYuukiDown();

    private Image YuukiUp = yuukiUp.getImage();

    private Image YuukiDown = yuukiDown.getImage();


    public OnePlayer() {
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
             TimeToPlay gui = new TimeToPlay();
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