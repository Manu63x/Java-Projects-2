import java.util.concurrent.Semaphore;

public class Bridge {
    private static int num = -1;
    private static Semaphore s;
    public Bridge(){
        s = new Semaphore(1);
    }
    public int readNum(){
        int tmp = num;
        num=-1;
        return tmp;
    }
    public void writeNum(int num){
        this.num=num;
    }
    public void acquire() throws InterruptedException {
        s.acquire();
    }
    public void release() {
        s.release();
    }
}
