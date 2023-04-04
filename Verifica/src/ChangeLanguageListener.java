import java.awt.event.*;
public class ChangeLanguageListener implements ActionListener {
    GUI g;
    public ChangeLanguageListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(g.comboLanguage.getSelectedItem() == "IT"){
            for(int i=0; i<g.animals.length; i++){
                g.animals[i].setText(g.strAnimIT[i]);
                g.btnShowDesc.setText(g.strShowBtn[0]);
            }
        }
        if(g.comboLanguage.getSelectedItem() == "ENG"){
            for(int i=0; i<g.animals.length; i++){
                g.animals[i].setText(g.strAnimENG[i]);
                g.btnShowDesc.setText(g.strShowBtn[1]);
            }
        }
    }
}
