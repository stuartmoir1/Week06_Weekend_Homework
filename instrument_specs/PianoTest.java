import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class PianoTest{

  Piano piano;

  @Before public void before(){
    piano = new Piano("Zimmermann", "Z122 Classic", 123, 150, 62);
  }

  @Test public void getPianoMakeModel(){
    assertEquals("Zimmermann Z122 Classic", piano.getMakeModel());
  }

  @Test public void getPianoDimensions(){
    assertEquals("123 150 62", piano.getDimensions());
  }

  @Test public void playPiano(){
    assertEquals("Plinky plonk!", piano.play());
  }

}