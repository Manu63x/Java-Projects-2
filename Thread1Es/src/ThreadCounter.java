import java.awt.*;
import javax.swing.*;
public class ThreadCounter extends Thread{
    GUI g;
    int tmp;
    public ThreadCounter(GUI g){
        this.g=g;
        tmp = 0;
        g.setStop(false);
        g.getLblCounter().setText(""+0);
    }
    public void run(){
        g.setThreads(true);
        while(g.getStop() == false){
            tmp = Integer.parseInt(g.getLblCounter().getText());
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            tmp++;
            g.getLblCounter().setText("" + tmp);
        }
        g.setThreads(false);
    }
}
