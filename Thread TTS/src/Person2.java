import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class Person2 extends Thread{
    String[] phrase ={"Invece","io","ti","interrompo","a","caso","perchè","voglio","rimanere","ignorante"};
    Synthesizer synthesizer;
    public Person2(String name, Synthesizer synthesizer){
        super(name);
        this.synthesizer=synthesizer;
    }
    public void run(){
        try {


// Resume Synthesizer
            synthesizer.resume();

// Speaks the given text
// until the queue is empty.
            for(String s : phrase) {
                System.out.println("Sono " + Thread.currentThread().getName() + ", parola: " + s);
                synthesizer.speakPlainText(
                        s, null);
                synthesizer.waitEngineState(
                        Synthesizer.QUEUE_EMPTY);
            }



        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}