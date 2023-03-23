import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonListener implements ActionListener {
    MorraCinese m;
    public ButtonListener(MorraCinese m){
        this.m=m;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int cpuCh = (int) (Math.random() * 2);
        if(e.getActionCommand().equals("Sasso")){
            if(cpuCh==0){ //pari
                m.lblCpu.setText("La CPU ha scelto: Sasso");
                m.lblPlayer.setText("Il giocatore ha scelto: Sasso");
                m.lblwinner.setText("Vincitore: PARI!");
            } else if (cpuCh==1) { //vince cpu (carta-sasso)
                m.lblCpu.setText("La CPU ha scelto: Carta");
                m.lblPlayer.setText("Il giocatore ha scelto: Sasso");
                m.lblwinner.setText("Vincitore: CPU");
            } else if (cpuCh==2) { //vince player (forbice-sasso)
                m.lblCpu.setText("La CPU ha scelto: Forbice");
                m.lblPlayer.setText("Il giocatore ha scelto: Sasso");
                m.lblwinner.setText("Vincitore: Giocatore");
            }
        }
        if(e.getActionCommand().equals("Carta")){
            if(cpuCh==0){ //vince player (sasso-carta)
                m.lblCpu.setText("La CPU ha scelto: Sasso");
                m.lblPlayer.setText("Il giocatore ha scelto: Carta");
                m.lblwinner.setText("Vincitore: Giocatore");
            } else if (cpuCh==1) { //pari
                m.lblCpu.setText("La CPU ha scelto: Carta");
                m.lblPlayer.setText("Il giocatore ha scelto: Carta");
                m.lblwinner.setText("Vincitore: PARI!");
            } else if (cpuCh==2) { //vince cpu (forbice-carta)
                m.lblCpu.setText("La CPU ha scelto: Forbice");
                m.lblPlayer.setText("Il giocatore ha scelto: Carta");
                m.lblwinner.setText("Vincitore: CPU");
            }
        }
        if(e.getActionCommand().equals("Forbice")){
            if(cpuCh==0){ //vince cpu (sasso-forbice)
                m.lblCpu.setText("La CPU ha scelto: Sasso");
                m.lblPlayer.setText("Il giocatore ha scelto: Forbice");
                m.lblwinner.setText("Vincitore: CPU");
            } else if (cpuCh==1) { //vince player (carta-forbice)
                m.lblCpu.setText("La CPU ha scelto: Carta");
                m.lblPlayer.setText("Il giocatore ha scelto: Forbice");
                m.lblwinner.setText("Vincitore: Giocatore");
            } else if (cpuCh==2) { //pari
                m.lblCpu.setText("La CPU ha scelto: Forbice");
                m.lblPlayer.setText("Il giocatore ha scelto: Forbice");
                m.lblwinner.setText("Vincitore: PARI!");
            }
        }
    }
}
