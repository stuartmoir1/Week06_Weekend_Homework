import static org.junit.Assert.*;
import org.junit.*;
import behaviours.*;
import instruments.*;
import accessories.*;

public class ShopTest{

  Shop shop;
  Sellable guitar;
  Sellable guitarStringSet;
  Sellable piano;
  Sellable pianoTuner;
  Sellable saxophone;
  Sellable saxophoneReed;

  @Before public void before(){
    shop = new Shop("Ray's Music Exchange");
    guitar = new Guitar("Fender", "Telecaster", 6, 2, 200, 250);
    guitarStringSet = new GuitarStringSet("RotoSound", "R10 Roto Yellow", "10-46w", 5, 6);
    piano = new Piano("Zimmermann", "Z122 Classic", 123, 150, 62, 2150, 2500);
    pianoTuner = new PianoTuner("John Walker", "Tuning Fork", "A.440", 10, 12);
    saxophone = new Saxophone("Startone", "SAS-75 Alto", "Brass", "Eb", 500, 600);
    saxophoneReed = new SaxophoneReed("Vandoren", "Alto Saxophone Reeds", 2, 10, 5, 6);
  }

  // Initialised

  @Test public void getGuitarMakeModel(){
    assertEquals("Ray's Music Exchange", shop.getName());
  }

  @Test public void stockStartsEmpty(){
    assertEquals(0, shop.stockCount());
  }

  // Instruments

  @Test public void addGuitarToStock(){
    shop.add(guitar);
    assertEquals(1, shop.stockCount());
  }

  @Test public void removeGuitarFromStock(){
    shop.add(guitar);
    shop.remove(guitar);
    assertEquals(0, shop.stockCount());
  }

  @Test public void addPianoToStock(){
    shop.add(piano);
    assertEquals(1, shop.stockCount());
  }

  @Test public void addSaxophoneToStock(){
    shop.add(saxophone);
    assertEquals(1, shop.stockCount());
  }

  // Accessories

  @Test public void addGuitarStringSetToStock(){
    shop.add(guitarStringSet);
    assertEquals(1, shop.stockCount());
  }

  @Test public void removeGuitarStringSetFromStock(){
    shop.add(guitarStringSet);
    shop.remove(guitarStringSet);
    assertEquals(0, shop.stockCount());
  }

  @Test public void addPianoTunerToStock(){
    shop.add(pianoTuner);
    assertEquals(1, shop.stockCount());
  }

  @Test public void addSaxophoneReedToStock(){
    shop.add(saxophoneReed);
    assertEquals(1, shop.stockCount());
  }

  // Miscellaneous

  @Test public void addAllItemsToStock(){
    shop.add(guitar);
    shop.add(guitarStringSet);
    shop.add(piano);
    shop.add(pianoTuner);
    shop.add(saxophone);
    shop.add(saxophoneReed);
    assertEquals(6, shop.stockCount());
  }

  @Test public void addClearAllItemsStock(){
    shop.add(guitar);
    shop.add(guitarStringSet);
    shop.add(piano);
    shop.add(pianoTuner);
    shop.add(saxophone);
    shop.add(saxophoneReed);
    shop.clear();
    assertEquals(0, shop.stockCount());
  }
}


































