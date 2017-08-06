import static org.junit.Assert.*;
import org.junit.*;
import accessories.*;

public class PianoTunerTest{

  PianoTuner pianoTuner;

  @Before public void before(){
    pianoTuner = new PianoTuner("John Walker", "Tuning Fork", "A.440", 10, 12);
  }

  @Test public void GetPianoTunerMakeModel(){
    assertEquals("John Walker Tuning Fork", pianoTuner.getMakeModel());
  }

  @Test public void GetPianoTunerPitch(){
    assertEquals("A.440", pianoTuner.getPitch());
  }

  @Test public void getPianoTunerPriceBuy(){
    assertEquals(10, pianoTuner.getPriceBuy());
  }

  @Test public void getPianoTunerPriceSell(){
    assertEquals(12, pianoTuner.getPriceSell());
  }

  @Test public void getPianoTunerMarkup(){
    assertEquals(2, pianoTuner.calculateMarkup());
  }
}