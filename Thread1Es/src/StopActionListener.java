import java.awt.event.*;
public class StopActionListener implements ActionListener {
    GUI g;
    public StopActionListener(GUI g){
        this.g=g;
    }
    public void actionPerformed(ActionEvent e){
        g.setStop(true);
    }
}
