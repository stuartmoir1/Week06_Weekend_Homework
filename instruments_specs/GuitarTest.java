import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class GuitarTest{

  Guitar guitar;

  @Before public void before(){
    guitar = new Guitar("Fender", "Telecaster", 6, 2, 200, 250);
  }

  @Test public void getGuitarMakeModel(){
    assertEquals("Fender Telecaster", guitar.getMakeModel());
  }

  @Test public void GetGuitarNumStrings(){
    assertEquals(6, guitar.getNumStrings());
  }

  @Test public void GetGuitarNumPickups(){
    assertEquals(2, guitar.getNumPickups());
  }

  @Test public void playGuitar(){
    assertEquals("Twang!", guitar.play());
  }

  @Test public void getGuitarPriceBuy(){
    assertEquals(200, guitar.getPriceBuy());
  }

  @Test public void getGuitarPriceSell(){
    assertEquals(250, guitar.getPriceSell());
  }

  @Test public void getGuitarMarkup(){
    assertEquals(50, guitar.calculateMarkup());
  }

}