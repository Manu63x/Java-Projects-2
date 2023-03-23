import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> buffer = new LinkedList<>();
        int maxSize = 100;

        Thread producer = new Thread(new Produzione(buffer, maxSize), "Produzione");
        Thread consumer = new Thread(new Stoccaggio(buffer, maxSize), "Stoccaggio");

        producer.start();
        consumer.start();
    }
}

class Produzione implements Runnable {
    private final Queue<Integer> magazzino;
    private final int maxSize;
    String[] prodotti = {"Legno lavorato", "Acciaio", "Intonaco"};
    public Produzione(Queue<Integer> magazzino, int maxSize) {
        this.magazzino = magazzino;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            try {
                produce((int) (Math.random() * prodotti.length));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void produce(int index) throws InterruptedException {
        synchronized (magazzino) {
            while (magazzino.size() == maxSize) {
                System.out.println("Magazzino pieno, Produzione in attesa...");
                magazzino.wait();
            }
            magazzino.offer(index);
            System.out.println("Prodotto: " + prodotti[index]);
            magazzino.notifyAll();
        }
    }
}

class Stoccaggio implements Runnable {
    private final Queue<Integer> magazzino;
    private final int maxSize;
    String[] prodotti = {"Legno lavorato", "Acciaio", "Intonaco"};
    public Stoccaggio(Queue<Integer> magazzino, int maxSize) {
        this.magazzino = magazzino;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            try {
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void consume() throws InterruptedException {
        synchronized (magazzino) {
            while (magazzino.isEmpty()) {
                System.out.println("Magazzino vuoto, Stoccaggio in attesa...");
                magazzino.wait();
            }

            int value = magazzino.poll();
            System.out.println("Consumato: " + prodotti[value]);
            magazzino.notifyAll();
        }
    }
}