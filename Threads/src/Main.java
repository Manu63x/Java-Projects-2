public class Main {
    public static void main(String[] args) {
        Prod p = new Prod();
        Cons c = new Cons();
        p.setName("Produttore");
        c.setName("Consumatore");
        p.start();
        c.start();
    }
}