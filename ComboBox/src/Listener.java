import java.awt.event.*;
import javax.swing.*;
public class Listener implements ItemListener {
    GUI g;
    public Listener(GUI g){
        this.g=g;
    }
    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == g.jc1){
            g.lbl1.setText(g.jc1.getSelectedItem() + " selezionato.");
        }

    }
}
