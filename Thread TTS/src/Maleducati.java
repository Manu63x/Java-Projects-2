import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import java.util.Locale;

public class Maleducati {
    public static void main(String[] args) {
        try{
            // Set property as Kevin Dictionary
            System.setProperty(
                    "freetts.voices",
                    "com.sun.speech.freetts.en.us"
                            + ".cmu_us_kal.KevinVoiceDirectory");

// Register Engine

            Central.registerEngineCentral(
                    "com.sun.speech.freetts"
                            + ".jsapi.FreeTTSEngineCentral");

// Create a Synthesizer
            Synthesizer synthesizer
                    = Central.createSynthesizer(
                    new SynthesizerModeDesc(Locale.US));
            // Allocate synthesizer
            synthesizer.allocate();
            System.out.println("Sono: "+Thread.currentThread().getName()+" Facciamoli parlare");
            Person1 p1=new Person1("Mario", synthesizer);
            Person2 p2=new Person2("Luigi", synthesizer);
            p1.start();
            p2.start();
            p1.join();
            p2.join();
            synthesizer.deallocate();
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}