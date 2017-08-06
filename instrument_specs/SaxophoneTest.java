import static org.junit.Assert.*;
import org.junit.*;
import instruments.*;

public class SaxophoneTest{

  Saxophone saxophone;

  @Before public void before(){
    saxophone = new Saxophone("Startone", "SAS-75 Alto", "Brass", "Eb");
  }

  @Test public void getSaxophoneMakeModel(){
    assertEquals("Startone SAS-75 Alto", saxophone.getMakeModel());
  }

  @Test public void getSaxophoneBody(){
    assertEquals("Brass", saxophone.getBody());
  }

  @Test public void getSaxophoneTuning(){
    assertEquals("Eb", saxophone.getTuning());
  }

  @Test public void playSaxophone(){
    assertEquals("Toot toot!", saxophone.play());
  }

}

