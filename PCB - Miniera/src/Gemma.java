public class Gemma {
    final int peso;
    float prezzo;
    public Gemma(){
        peso = (int) ((1+Math.random())*100);
        prezzo = (float) Math.random()*501;
    }
    public int getPeso(){
        return peso;
    }
    public float getPrezzo(){
        return prezzo;
    }
    public void setPrezzo(float prezzo){
        this.prezzo=prezzo;
    }
    @Override
    public String toString(){
        return "Peso: " + peso + ", Prezzo: " + prezzo;
    }
}
