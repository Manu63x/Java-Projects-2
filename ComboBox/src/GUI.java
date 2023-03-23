import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI {
    JFrame frm;
    JPanel pnl1;
    JComboBox jc1;
    JLabel lbl1;
    public GUI(){
        frm = new JFrame("Prova ComboBox");
        Container c = frm.getContentPane();
        String[] cities = {"Milano", "Roma", "Napoli"};
        jc1 = new JComboBox<>(cities);
        jc1.addItemListener(new Listener(this));
        lbl1 = new JLabel("Nessuna città selezionata.");
        pnl1 = new JPanel();
        pnl1.setLayout(new FlowLayout());
        pnl1.add(jc1);
        pnl1.add(lbl1);
        c.add(pnl1, BorderLayout.NORTH);
        frm.setSize(500, 500);
        frm.setVisible(true);
    }
}
