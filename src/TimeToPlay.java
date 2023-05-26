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
    private JButton draww;

    private TheBoard use = new TheBoard();

    BoardGame m = new BoardGame();

    public TimeToPlay() {
        setContentPane(scroll);
        setSize(1500, 12000);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Board");
        setVisible(true);
        draww.addActionListener(this);

    }
    public void paint(Graphics g, int x, int y, int alpha) {
        super.paint(g);

        g.setColor(Color.RED);
        g.drawLine(0, 30, 350, 30);

        g.setColor(Color.BLUE);
        g.drawRect(200, 100, 450, 250);
        g.drawString("x = 10 cm", 400, 90);
        g.drawString("y = 2 cm", 670, 200);
        //g.drawLine(200, 350, 450, 250);
        g.drawArc(200, 350, x, y, alpha, 70);
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
