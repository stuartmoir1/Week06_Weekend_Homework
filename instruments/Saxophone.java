// Class
package instruments;
import behaviours.*;

public class Saxophone implements Playable{

  // Instance variables.
  private String maker;
  private String model;
  private String body;
  private String tuning;

  // Constructor
  public Saxophone(String maker, String model, String body, String tuning){
    this.maker = maker;
    this.model = model;
    this.body = body;
    this.tuning = tuning;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Toot toot!";
  }

  public String getMakeModel(){
    return this.maker + " "  + this.model;
  }

  public String getBody(){
    return this.body;
  }

  public String getTuning(){
    return this.tuning;
  }
}