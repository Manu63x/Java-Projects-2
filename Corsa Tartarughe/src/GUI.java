import javax.swing.*;
import java.awt.*;
public class GUI {
    JPanel pnlSouth;
    JFrame frmPrin;
    JButton btnStart;
    public GUI(){
        frmPrin = new JFrame("Corsa Tartarughe");
        frmPrin.add(new JLabel(new ImageIcon("C:\\Users\\manun\\IdeaProjects\\Corsa Tartarughe\\src\\terrain.jpg")));
        Container c = frmPrin.getContentPane();
        pnlSouth = new JPanel();
        btnStart = new JButton("Start");
        btnStart.setBackground(Color.RED);
        pnlSouth.setLayout(new FlowLayout());
        pnlSouth.add(btnStart);
        c.add(pnlSouth, BorderLayout.SOUTH);
        frmPrin.setSize(1920, 1080);
        frmPrin.setVisible(true);
    }
}
