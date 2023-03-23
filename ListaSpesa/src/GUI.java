import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class GUI {
    JFrame frmPrin;
    JPanel pnlNorth;
    JPanel pnlCen;
    JPanel pnlSouth;
    JLabel lbl1;
    JTextField txtFld1;
    JTextField txtFld2;
    JTextArea txtArea1;
    JButton btn1;
    JButton btn2;
    Vector <Item> lista;
    public GUI(){
        lista = new Vector<Item>();
        frmPrin = new JFrame("Lista della spesa");
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        pnlNorth = new JPanel();
        pnlCen = new JPanel();
        pnlSouth = new JPanel();
        lbl1 = new JLabel("Inserisci cosa comprare: ");
        txtFld1 = new JTextField();
        txtFld2 = new JTextField();
        txtArea1 = new JTextArea();
        btn1 = new JButton("Aggiungi");
        btn2 = new JButton("Rimuovi nella posiz. spec.");
        btn1.addActionListener(new AddItemListener(this));
        btn2.addActionListener(new DeleteItem(this));
        txtFld1.setPreferredSize(new Dimension(350, 20));
        txtFld2.setPreferredSize(new Dimension(350, 20));
        txtArea1.setPreferredSize(new Dimension(350, 350));
        pnlNorth.add(lbl1);
        pnlNorth.add(txtFld1);
        pnlNorth.add(btn1);
        pnlCen.add(txtArea1);
        pnlSouth.add(txtFld2);
        pnlSouth.add(btn2);
        c.add(pnlNorth, BorderLayout.NORTH);
        c.add(pnlCen, BorderLayout.CENTER);
        c.add(pnlSouth, BorderLayout.SOUTH);
        Dimension dimension = new Dimension(750,500);
        frmPrin.setSize(dimension);
        frmPrin.setVisible(true);
    }
}
