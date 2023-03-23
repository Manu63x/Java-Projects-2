import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class ConfirmActionListener implements ActionListener{
    GUI g;
    public ConfirmActionListener(GUI g){
        this.g=g;
    }
    public void actionPerformed(ActionEvent e){
        File file = new File("database.csv");
        try{
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            try {
                String str = "" + g.txt1.getText() + ";" + g.txt2.getText() + ";" + g.btnGrp1.getSelection().getActionCommand() + ";";
                for (JCheckBox c : g.checkHobbies) {
                    if(c.isSelected()){
                        str+=c.getText() + ";";
                    }else{
                        str+="none;";
                    }
                }
                str+=g.comuni.getSelectedItem() + "\n";
                fw.write(str);
                fw.close();
            }catch (NullPointerException ex){

            }
        }catch(IOException exc){

        }
    }
}
