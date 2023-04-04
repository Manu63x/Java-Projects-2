import java.awt.event.*;

public class StartBtnListener implements ActionListener {
    GUI g;
    public StartBtnListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        g.btnStart.setEnabled(false);
        for (int i=0; i<10; i++){

        }
    }
}
