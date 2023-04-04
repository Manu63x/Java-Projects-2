import java.awt.*;
import javax.swing.*;
public class GUI {
    JFrame frmPrin;
    JPanel pnlNorth;
    JPanel pnlCenter;
    JPanel pnlSouth;
    JPanel pnlRadioBtn;
    JPanel pnlCombo;
    JRadioButton[] animals = new JRadioButton[3];
    ButtonGroup grpAnimals;
    JComboBox comboLanguage;
    JTextArea txtDescr;
    JButton btnShowDesc;
    String[] strAnimIT = {"Leone", "Tigre", "Elefante"};
    String[] strAnimENG = {"Lion", "Tiger", "Elephant"};
    String[] strShowBtn = {"Visualizza descrizione", "Show description"};
    String[] strLanguages = {"IT", "ENG"};
    public GUI(){
        frmPrin = new JFrame("Animal descriptions");
        Container c = frmPrin.getContentPane();
        pnlNorth = new JPanel();
        pnlCenter = new JPanel();
        pnlSouth = new JPanel();
        pnlRadioBtn = new JPanel();
        pnlCombo = new JPanel();
        pnlNorth.setLayout(new FlowLayout());
        pnlCenter.setLayout(new BorderLayout());
        pnlSouth.setLayout(new FlowLayout());
        pnlRadioBtn.setLayout(new GridLayout(4, 1));
        pnlCombo.setLayout(new BorderLayout());
        grpAnimals = new ButtonGroup();
        for(int i=0; i<animals.length; i++){
            animals[i]=new JRadioButton(strAnimIT[i]);
            grpAnimals.add(animals[i]);
            pnlRadioBtn.add(animals[i]);
        }
        comboLanguage = new JComboBox<>(strLanguages);
        comboLanguage.addActionListener(new ChangeLanguageListener(this));
        pnlCombo.add(comboLanguage);
        pnlNorth.add(pnlRadioBtn);
        pnlNorth.add(pnlCombo);
        txtDescr = new JTextArea("");
        pnlCenter.add(txtDescr);
        btnShowDesc = new JButton("Visualizza descrizione");
        btnShowDesc.addActionListener(new ShowDescListener(this));
        pnlSouth.add(btnShowDesc);
        c.add(pnlNorth, BorderLayout.NORTH);
        c.add(pnlCenter, BorderLayout.CENTER);
        c.add(pnlSouth, BorderLayout.SOUTH);
        frmPrin.setVisible(true);
        frmPrin.setSize(new Dimension(800, 500));
    }
}
