import java.awt.*;
import javax.swing.*;
public class GUI {
    JFrame frm;
    JPanel pnlImg;
    JPanel pnlSouth;
    JPanel pnlText;
    JPanel pnlInput;
    JLabel lblTitle;
    JLabel lblImg;
    JLabel lblTime;
    JTextField txtName;
    JButton btnSubmit;
    JButton btnStart;
    public GUI(){
        frm = new JFrame("Quiz");
        Container c = frm.getContentPane();
        pnlImg = new JPanel();
        pnlImg.setLayout(new GridLayout(2,1));
        pnlImg.setBackground(Color.GRAY);
        pnlSouth = new JPanel();
        pnlSouth.setLayout(new GridLayout(3,1));
        pnlSouth.setBackground(Color.GRAY);
        pnlText = new JPanel();
        pnlText.setLayout(new FlowLayout());
        pnlText.setBackground(Color.GRAY);
        pnlInput = new JPanel();
        pnlInput.setLayout(new FlowLayout());
        pnlInput.setBackground(Color.GRAY);
        lblTitle = new JLabel("Guess the character", SwingConstants.CENTER);
        lblTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 14));
        lblImg = new JLabel(new ImageIcon());
        lblTime = new JLabel("0", SwingConstants.CENTER);
        txtName = new JTextField();
        txtName.setPreferredSize(new Dimension(200, 50));
        btnSubmit = new JButton("Submit");
        btnStart = new JButton("Start");
        btnStart.addActionListener(new StartBtnListener(this));

        pnlImg.add(lblImg);

        pnlText.add(txtName);

        pnlInput.add(btnStart);
        pnlInput.add(btnSubmit);

        pnlSouth.add(lblTime);
        pnlSouth.add(pnlText);
        pnlSouth.add(pnlInput);
        c.add(lblTitle, BorderLayout.NORTH);
        c.add(pnlImg, BorderLayout.CENTER);
        c.add(pnlSouth, BorderLayout.SOUTH);

        frm.getContentPane().setBackground(Color.GRAY);
        frm.setSize(new Dimension(600, 400));
        frm.setVisible(true);
    }
}
