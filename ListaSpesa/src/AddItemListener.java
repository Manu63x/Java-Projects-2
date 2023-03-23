import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class AddItemListener implements ActionListener{
    GUI g;
    public AddItemListener(GUI g){
        this.g = g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        g.lista.add(new Item(g.txtFld1.getText()));
        g.txtFld1.setText("");
        String list = "";
        for(int i = 0; i< g.lista.size(); i++){
            list += g.lista.elementAt(i).getItemName() + "\n";
        }
        g.txtArea1.setText(list);
    }
}
