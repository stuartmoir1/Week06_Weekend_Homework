import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class GuitarTest{

  Guitar guitar;

  @Before public void before(){
    guitar = new Guitar("Fender", "Telecaster");
  }

  @Test public void getGuitarDetails(){
    assertEquals("Fender Telecaster", guitar.getDetails());
  }

  @Test public void playGuitar(){
    assertEquals("Twang!", guitar.play());
  }

}