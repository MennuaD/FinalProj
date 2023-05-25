import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



public class TimeToPlay extends JFrame implements ActionListener, ItemListener, ChangeListener {
    private JPanel board;
    private JScrollPane scroll;

    private TheBoard use = new TheBoard();

    public TimeToPlay() {
        setContentPane(scroll);
        setSize(1500, 12000);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Board");
        setVisible(true);
        Graphics g = null;
        for (int i = 0; i <= 12000; i += 100){
            g.drawLine(0, i, 1500, i + 10);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        JButton button = (JButton) source;
        String text = button.getText();

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}
