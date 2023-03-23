import javax.swing.*;
import java.awt.*;
public class MorraCinese {
    JFrame frmPrin;
    JPanel pnlPrin;
    JPanel pnlCh;
    JPanel pnlWinner;
    JLabel lblCpu;
    JLabel lblPlayer;
    JLabel lblwinner;
    JButton btnSasso;
    JButton btnCarta;
    JButton btnForbice;
    public MorraCinese(){
        frmPrin = new JFrame("Morra Cinese");
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        lblCpu = new JLabel("La CPU ha scelto: ");
        lblPlayer = new JLabel("Il giocatore ha scelto: ");
        lblwinner = new JLabel("Vincitore: ");
        btnSasso = new JButton("Sasso");
        btnCarta = new JButton("Carta");
        btnForbice = new JButton("Forbice");
        btnSasso.addActionListener(new ButtonListener(this));
        btnCarta.addActionListener(new ButtonListener(this));
        btnForbice.addActionListener(new ButtonListener(this));
        pnlPrin = new JPanel();
        pnlCh = new JPanel();
        pnlWinner = new JPanel();
        //disposizione
        pnlPrin.add(btnSasso);
        pnlPrin.add(btnCarta);
        pnlPrin.add(btnForbice);
        pnlCh.add(lblCpu);
        pnlCh.add(lblPlayer);
        pnlWinner.add(lblwinner);
        c.add(pnlCh, BorderLayout.NORTH);
        c.add(pnlPrin, BorderLayout.SOUTH);
        c.add(pnlWinner, BorderLayout.CENTER);
        // dimensioni Container
        Dimension dimension=new Dimension(400,300);
        frmPrin.setSize(dimension);
        frmPrin.setVisible(true);
    }
}
