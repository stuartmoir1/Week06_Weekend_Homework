import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import instruments.*;
import accessories.*;

public class ShopTest{

  Shop shop;
  Sellable guitar;
  Sellable guitarStringSet;

  @Before public void before(){
    shop = new Shop("Ray's Music Exchange");
    guitar = new Guitar("Fender", "Telecaster", 6, 2, 200, 250);
    guitarStringSet = new GuitarStringSet("RotoSound", "R10 Roto Yellow", "10-46w", 5, 6);
  }

  @Test public void getGuitarMakeModel(){
    assertEquals("Ray's Music Exchange", shop.getName());
  }
}