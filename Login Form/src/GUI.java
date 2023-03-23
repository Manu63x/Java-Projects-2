import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frm;
    JPanel center;
    JPanel nomeCognome;
    JPanel gen;
    JPanel hobbies;
    JLabel lbl1;
    JTextField txt1;
    JLabel lbl2;
    JTextField txt2;
    JRadioButton[] radioGen;
    ButtonGroup btnGrp1;
    JCheckBox[] checkHobbies;
    JComboBox comuni;
    JButton confirm;
    public GUI() {
        frm = new JFrame("Login");
        center = new JPanel();
        center.setLayout(new GridLayout(4,1));
        nomeCognome = new JPanel();
        gen = new JPanel();
        hobbies = new JPanel();
        nomeCognome.setLayout(new FlowLayout());
        gen.setLayout(new GridLayout(3,1));
        hobbies.setLayout(new GridLayout(3, 2));
        lbl1 = new JLabel("Nome: ");
        txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(100, 20));
        lbl2 = new JLabel("Cognome: ");
        txt2 = new JTextField();
        txt2.setPreferredSize(new Dimension(100, 20));
        nomeCognome.add(lbl1);
        nomeCognome.add(txt1);
        nomeCognome.add(lbl2);
        nomeCognome.add(txt2);
        radioGen = new JRadioButton[3];
        radioGen[0] = new JRadioButton("Uomo");
        radioGen[0].setActionCommand("Uomo");
        radioGen[1] = new JRadioButton("Donna");
        radioGen[1].setActionCommand("Donna");
        radioGen[2] = new JRadioButton("Altro");
        radioGen[2].setActionCommand("Altro");
        btnGrp1 = new ButtonGroup();
        for(int i=0; i<3; i++){
            btnGrp1.add(radioGen[i]);
            gen.add(radioGen[i]);
        }
        checkHobbies = new JCheckBox[6];
        checkHobbies[0] = new JCheckBox("Videogiochi");
        checkHobbies[1] = new JCheckBox("Arte");
        checkHobbies[2] = new JCheckBox("Cucina");
        checkHobbies[3] = new JCheckBox("Giardinaggio");
        checkHobbies[4] = new JCheckBox("Sport");
        checkHobbies[5] = new JCheckBox("Politica");
        for(int i=0; i<6; i++){
            hobbies.add(checkHobbies[i]);
        }
        String[] cities = {"Legnano", "Parabiago", "Nerviano", "Busto Arsizio", "Busto Garolfo", "San Vittore Olona", "San Giorgio", "Castellanza"};
        comuni = new JComboBox<>(cities);
        confirm = new JButton("Conferma");
        confirm.addActionListener(new ConfirmActionListener(this));
        Container c = frm.getContentPane();
        center.add(nomeCognome);
        center.add(gen);
        center.add(hobbies);
        center.add(comuni);
        c.setLayout(new BorderLayout());
        c.add(center, BorderLayout.CENTER);
        c.add(confirm, BorderLayout.SOUTH);
        frm.setSize(400, 400);
        frm.setVisible(true);
    }
}
