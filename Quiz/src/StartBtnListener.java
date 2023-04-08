import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class StartBtnListener implements ActionListener {
    GUI g;
    public StartBtnListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        g.btnStart.setEnabled(false);
        File folder = new File("photos");
        File[] files = folder.listFiles();
        int imgNum;
        for (int i=0; i<10; i++){
            imgNum=(int)(Math.random()*files.length);
            g.lblImg.setIcon(new ImageIcon(files[imgNum].getAbsolutePath()));
            new Thread(() -> {
                for (int j=0; j<=10; j++){
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException ex){
                        ex.printStackTrace();
                    }
                    g.lblTime.setText("" + (10 - j));
                }
            }).start();
        }
    }
}
