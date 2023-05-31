import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class TheBoard extends JFrame implements ActionListener, ItemListener, ChangeListener {
    private JPanel mainPanel;
    private JButton a2PlayerButton;
    private JButton onePlayerButton;

    public TheBoard(){
        this.setContentPane(mainPanel);
        setSize(2900, 1200);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Page");
        setVisible(true);
        a2PlayerButton.addActionListener(this);
        onePlayerButton.addActionListener(this);
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
        if(text.equals("2 Player(WIP)")){
        }
        if(text.equals("1 Player")){
            timer(3);
            this.dispose();
            OnePlayer gui = new OnePlayer();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
