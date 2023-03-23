import java.awt.event.*;
import java.io.File;
import java.nio.file.Files;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class FileChooserListener implements ActionListener {
    GUI g;
    public FileChooserListener(GUI g){
        this.g=g;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int returnValue = jfc.showOpenDialog( null);
        if(returnValue == JFileChooser.APPROVE_OPTION){
            if(returnValue == JFileChooser.APPROVE_OPTION){
                g.f = jfc.getSelectedFile();
            }
        }
    }
}
