import java.util.Locale;
import javax.speech.Central;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.speech.synthesis.Synthesizer;

public class Person1 extends Thread{
    String[] phrase ={"Ciao", "sono", "persona", "uno"};
    Synthesizer synthesizer;
    public Person1(String name, Synthesizer synthesizer){
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
