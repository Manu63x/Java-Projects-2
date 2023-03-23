import java.awt.event.*;
import javax.swing.*;

public class KeyboardListener implements ActionListener {
    GUI g;
    public KeyboardListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        g.txtFld1.setText(g.txtFld1.getText() + e.getActionCommand());
    }
}
