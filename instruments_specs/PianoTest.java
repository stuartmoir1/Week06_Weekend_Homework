import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class PianoTest{

  Piano piano;

  @Before public void before(){
    piano = new Piano("Zimmermann", "Z122 Classic", 123, 150, 62, 2150, 2500);
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

  @Test public void getGuitarPriceBuy(){
    assertEquals(2150, piano.getPriceBuy());
  }

  @Test public void getGuitarPriceSell(){
    assertEquals(2500, piano.getPriceSell());
  }

  @Test public void getPianoMarkup(){
    assertEquals(350, piano.calculateMarkup());
  }
}