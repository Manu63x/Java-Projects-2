import java.util.ArrayList;

public class Trasportatore extends Lavoratore implements Runnable{
    ArrayList<Gemma> a;
    public Trasportatore(String nome, String cognome, ArrayList<Gemma> a){
        super(nome, cognome);
        this.a = a;
    }
    public void transportGem(){
        synchronized (a) {
            System.out.println("Trasportatore: " + a.get(0).toString());
            a.remove(0);
            a.notifyAll();
        }
    }
    public void run(){
        while(true) {
            try {
                Thread.sleep((long)(Math.random()*4001)+1000); //prova, fare random
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                while(a.isEmpty()){
                    System.out.println("Deposito vuoto. In attesa di gemme...");
                }
                transportGem();
            }
        }
    }
}
