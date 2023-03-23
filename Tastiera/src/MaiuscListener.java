import javax.swing.*;
import java.awt.event.*;
public class MaiuscListener implements ActionListener{
    boolean state = false;
    GUI g;
    public MaiuscListener(GUI g){
        this.g=g;
    }
    public void actionPerformed(ActionEvent e){
        if(state == false){
            for (int i=0; i<g.tastiera.length; i++){
                g.tastiera[i].setText("" + (char) (g.tastiera[i].getText().charAt(0) - 32));
            }
            state = true;
        }else{
            for (int i=0; i<g.tastiera.length; i++){
                g.tastiera[i].setText("" + (char) (g.tastiera[i].getText().charAt(0) + 32));
            }
            state = false;
        }
    }
}
