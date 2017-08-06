import static org.junit.Assert.*;
import org.junit.*;
import accessories.*;

public class SaxophoneReedTest{

  SaxophoneReed saxophoneReed;

  @Before public void before(){
    saxophoneReed = new SaxophoneReed("Vandoren", "Alto Saxophone Reeds", 2, 10, 5, 6);
  }

  @Test public void GetSaxophoneReedMakeModel(){
    assertEquals("Vandoren Alto Saxophone Reeds", saxophoneReed.getMakeModel());
  }

  @Test public void GetSaxophoneReedGauge(){
    assertEquals(2, saxophoneReed.getStrength());
  }

  @Test public void GetSaxophoneReedNumber(){
    assertEquals(10, saxophoneReed.getNumber());
  }

  @Test public void getSaxophoneReedPriceBuy(){
    assertEquals(5, saxophoneReed.getPriceBuy());
  }

  @Test public void getSaxophoneReedPriceSell(){
    assertEquals(6, saxophoneReed.getPriceSell());
  }

  @Test public void getSaxophoneReedMarkup(){
    assertEquals(1, saxophoneReed.calculateMarkup());
  }
}