import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class TheBoard extends JFrame {
    private JPanel panel1;
    private JButton a2PlayerButton;
    private JButton practice1PlayerButton;
    private JTextArea textArea1;

    public TheBoard() {
    setContentPane(panel1);
    setTitle("Main Page");
    setSize(400, 400);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
