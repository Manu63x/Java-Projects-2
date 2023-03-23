import java.util.ArrayList;

public class Minatore extends Lavoratore implements Runnable{
    ArrayList<Gemma> a;
    public Minatore(String nome, String cognome, ArrayList<Gemma> a){
        super(nome, cognome);
        this.a = a;
    }
    public void extractGem(){
        synchronized (a) {
            a.add(new Gemma());
            a.notifyAll();
        }
    }
    public void run(){
        while(true) {
            try {
                Thread.sleep((long) (Math.random()*4001)+1000); //prova, fare random
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                extractGem();
                System.out.println("Minatore ha estratto una gemma da: " + a.get(a.size()-1).toString());
            }
        }
    }
}
