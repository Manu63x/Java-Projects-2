import javax.swing.*;
import java.awt.*;
import java.io.File;

public class GUI {
    JButton[] tastiera;
    JButton maiusc;
    JButton fileChooser;
    JButton start;
    JLabel lbl1;
    JTextField txtFld1;
    JPanel pnlTastiera;
    JPanel pnlNorth;
    JPanel pnlCenter;
    JFrame frmPrin;
    MaiuscListener mlist;
    File f;
    public GUI(){
        mlist = new MaiuscListener(this);
        tastiera  = new JButton[26];
        fileChooser = new JButton("Apri file");
        fileChooser.addActionListener(new FileChooserListener(this));
        start = new JButton("Avvia");
        start.addActionListener(new StartListener(this));
        lbl1 = new JLabel("Inserisci la parola da cercare: ");
        txtFld1 = new JTextField();
        pnlTastiera = new JPanel();
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        frmPrin = new JFrame("Ricorrenze in un file di testo");
        pnlTastiera.setLayout(new GridLayout(3,9));
        pnlNorth.setLayout(new FlowLayout());
        pnlCenter.setLayout(new GridLayout(2,1));
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        pnlNorth.add(fileChooser);
        pnlNorth.add(start);
        pnlCenter.add(lbl1);
        pnlCenter.add(txtFld1);
        KeyboardListener k = new KeyboardListener(this);
        for(int i=0; i<26; i++) {
            tastiera[i] = new JButton("" + (char) ('a' + i));
            tastiera[i].addActionListener(k);
            pnlTastiera.add(tastiera[i]);
        }
        maiusc = new JButton("Maiusc.");
        maiusc.addActionListener(mlist);
        pnlTastiera.add(maiusc);
        c.add(pnlNorth, BorderLayout.NORTH);
        c.add(pnlCenter, BorderLayout.CENTER);
        c.add(pnlTastiera, BorderLayout.SOUTH);
        Dimension dimension=new Dimension(720,200);
        frmPrin.setSize(dimension);
        frmPrin.setVisible(true);
    }
}
