import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class SaxophoneTest{

  Saxophone saxophone;

  @Before public void before(){
    saxophone = new Saxophone("Startone", "SAS-75 Alto");
  }

  @Test public void getSaxophoneDetails(){
    assertEquals("Startone SAS-75 Alto", saxophone.getDetails());
  }

  @Test public void playSaxophone(){
    assertEquals("Toot toot!", saxophone.play());
  }

}

