import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DeleteItem implements ActionListener{
    GUI g;
    public DeleteItem(GUI g){
        this.g = g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        int index;
        try{
            index = Integer.parseInt(g.txtFld2.getText());
            g.txtFld2.setText("");
            try{
                g.lista.remove(index - 1);
            }catch(ArrayIndexOutOfBoundsException exc) {
                return;
            }
            String list = "";
            for(int i = 0; i< g.lista.size(); i++){
                list += g.lista.elementAt(i).getItemName() + "\n";
            }
            g.txtArea1.setText(list);
        }catch (NumberFormatException ex){

        }

    }
}
