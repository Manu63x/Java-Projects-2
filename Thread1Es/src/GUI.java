import java.awt.*;
import javax.swing.*;
public class GUI {
    private static JFrame frmPrin;
    private static JPanel pnlNord;
    private static JPanel pnlCenter;
    private static JPanel pnlSouth;
    private static JLabel lblInt;
    private static JLabel lblCounter;
    private static JButton btnStart;
    private static JButton btnStop;
    private static boolean stop = false;
    private static boolean threads = false;

    public static JFrame getFrmPrin() {
        return frmPrin;
    }

    public static void setFrmPrin(JFrame frmPrin) {
        GUI.frmPrin = frmPrin;
    }

    public static JPanel getPnlNord() {
        return pnlNord;
    }

    public static void setPnlNord(JPanel pnlNord) {
        GUI.pnlNord = pnlNord;
    }

    public static JPanel getPnlCenter() {
        return pnlCenter;
    }

    public static void setPnlCenter(JPanel pnlCenter) {
        GUI.pnlCenter = pnlCenter;
    }

    public static JPanel getPnlSouth() {
        return pnlSouth;
    }

    public static void setPnlSouth(JPanel pnlSouth) {
        GUI.pnlSouth = pnlSouth;
    }

    public static JLabel getLblInt() {
        return lblInt;
    }

    public static void setLblInt(JLabel lblInt) {
        GUI.lblInt = lblInt;
    }

    public static JLabel getLblCounter() {
        return lblCounter;
    }

    public static void setLblCounter(JLabel lblCounter) {
        GUI.lblCounter = lblCounter;
    }

    public static JButton getBtnStart() {
        return btnStart;
    }

    public static void setBtnStart(JButton btnStart) {
        GUI.btnStart = btnStart;
    }

    public static JButton getBtnStop() {
        return btnStop;
    }

    public static void setBtnStop(JButton btnStop) {
        GUI.btnStop = btnStop;
    }

    public static boolean getStop() {
        return stop;
    }

    public static void setStop(boolean stop) {
        GUI.stop = stop;
    }

    public static boolean getThreads() {
        return threads;
    }

    public static void setThreads(boolean threads) {
        GUI.threads=threads;
    }

    public GUI(){
        frmPrin = new JFrame("Counter");
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        pnlNord = new JPanel();
        pnlNord.setLayout(new FlowLayout());
        pnlCenter = new JPanel();
        pnlCenter.setLayout(new FlowLayout());
        pnlSouth = new JPanel();
        pnlSouth.setLayout(new FlowLayout());
        lblInt = new JLabel("Counter");
        lblCounter = new JLabel("0");
        btnStart = new JButton("Start");
        btnStart.addActionListener(new StartActionListener(this));
        btnStop = new JButton("Stop");
        btnStop.addActionListener(new StopActionListener(this));
        pnlNord.add(lblInt);
        pnlCenter.add(lblCounter);
        pnlSouth.add(btnStart);
        pnlSouth.add(btnStop);
        c.add(pnlNord, BorderLayout.NORTH);
        c.add(pnlCenter, BorderLayout.CENTER);
        c.add(pnlSouth, BorderLayout.SOUTH);
        frmPrin.setSize(new Dimension(400, 200));
        frmPrin.setVisible(true);
    }
}
