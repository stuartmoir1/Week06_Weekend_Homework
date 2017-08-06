import static org.junit.Assert.*;
import org.junit.*;
import accessories.*;

public class GuitarStringSetTest{

  GuitarStringSet guitarStringSet;

  @Before public void before(){
    guitarStringSet = new GuitarStringSet("RotoSound", "R10 Roto Yellow", "10-46w", 5, 6);
  }

  @Test public void GetGuitarStringSetMakeModel(){
    assertEquals("RotoSound R10 Roto Yellow", guitarStringSet.getMakeModel());
  }

  @Test public void GetGuitarStringSetGauge(){
    assertEquals("10-46w", guitarStringSet.getGauge());
  }

  @Test public void getGuitarStringSetPriceBuy(){
    assertEquals(5, guitarStringSet.getPriceBuy());
  }

  @Test public void getGuitarStringSetPriceSell(){
    assertEquals(6, guitarStringSet.getPriceSell());
  }

  @Test public void getGuitarStringSetMarkup(){
    assertEquals(1, guitarStringSet.calculateMarkup());
  }
}