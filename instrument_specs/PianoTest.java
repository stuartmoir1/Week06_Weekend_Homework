import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class PianoTest{

  Piano piano;

  @Before public void before(){
    piano = new Piano("Zimmermann", "Z122 Classic");
  }

  @Test public void getPianoDetails(){
    assertEquals("Zimmermann Z122 Classic", piano.getDetails());
  }

  @Test public void playPiano(){
    assertEquals("Plinky plonk!", piano.play());
  }

}