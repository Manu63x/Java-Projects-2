import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ShowDescListener implements ActionListener {
    GUI g;
    File f;
    public ShowDescListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(g.comboLanguage.getSelectedItem() == "IT"){
            for(int i=0; i<g.animals.length; i++){
                if (g.animals[i].isSelected()){
                    String path = "src/" + g.animals[i].getText() + "IT.txt";
                    f = new File(path);
                    String content = "";
                    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while((line = br.readLine()) != null){
                            content+=line;
                            content+="\n";
                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    g.txtDescr.setText(content);
                }
            }
        } else if (g.comboLanguage.getSelectedItem() == "ENG") {
            for(int i=0; i<g.animals.length; i++){
                if (g.animals[i].isSelected()){
                    String path = "src/" + g.animals[i].getText() + "ENG.txt";
                    f = new File(path);
                    String content = "";
                    try {
                        FileReader fr = new FileReader(f);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        while((line = br.readLine()) != null){
                            content+=line;
                            content+="\n";
                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                    g.txtDescr.setText(content);
                }
            }
        }
    }
}
