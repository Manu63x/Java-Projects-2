public class Cons extends Thread{
    Bridge b;
    public Cons(){
        b=new Bridge();
    }
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            try{
                b.acquire();
                System.out.println("Sono: " + Thread.currentThread().getName() + ", ho letto: " + b.readNum());
            }catch(InterruptedException e) {
                e.printStackTrace();
            }finally {
                b.release();
            }
        }
    }
}
