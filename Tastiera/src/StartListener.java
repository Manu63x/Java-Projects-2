import java.awt.event.*;
import java.io.IOException;
import java.nio.file.Files;
import javax.swing.*;
public class StartListener implements ActionListener{
    GUI g;
    public StartListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int occur;
        String in = g.txtFld1.getText();
        try{
            try {
                String fileText = Files.readString(g.f.toPath());
                occur = fileText.split(in, -1).length - 1;
                JOptionPane.showMessageDialog(g.frmPrin, "Numero di occorrenze: " + occur, "Info", 1);
            }catch (NullPointerException ex){

            }
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(g.frmPrin, "Errore!", "Dialog", 0);
        }
    }
}
