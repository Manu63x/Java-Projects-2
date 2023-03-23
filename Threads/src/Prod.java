import java.sql.SQLOutput;

public class Prod extends Thread {
    Bridge b;
    int generated;
    public Prod(){
        b=new Bridge();
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try{
                b.acquire();
                generated=(int) (Math.random()*100);
                System.out.println("Sono: " + Thread.currentThread().getName() + ", ho generato: " + generated);
                b.writeNum(generated);
                try {
                    sleep((int) (Math.random()*6000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }finally {
                b.release();
            }
        }
    }
}
