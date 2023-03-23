import java.util.ArrayList;

public class Miniera {
    public static void main(String[] args) {
        Trasportatore tr1, tr2;
        Minatore mn1, mn2;
        ArrayList<Gemma> a = new ArrayList<Gemma>();
        tr1 = new Trasportatore("Ciro", "Esposito", a);
        tr2 = new Trasportatore("Mario", "Rossi", a);
        mn1 = new Minatore("Luca", "Verdi", a);
        mn2 = new Minatore("Marco", "Neri", a);
        Thread th1 = new Thread(mn1);
        Thread th2 = new Thread(mn2);
        Thread th3 = new Thread(tr1);
        Thread th4 = new Thread(tr2);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
    }
}
