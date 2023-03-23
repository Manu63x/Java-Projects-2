import java.awt.event.*;
public class StartActionListener implements ActionListener {
    GUI g;
    public StartActionListener(GUI g){
        this.g=g;
    }
    public void actionPerformed(ActionEvent e){
        if(g.getThreads() == false){
            ThreadCounter th = new ThreadCounter(g);
            th.start();
        }
    }
}
