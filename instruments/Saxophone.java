// Class
package instruments;
import behaviours.*;

public class Saxophone implements Playable{

  // Instance variables.
  private String maker;
  private String model;

  // Constructor
  public Saxophone(String maker, String model){
    this.maker = maker;
    this.model = model;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Toot toot!";
  }

  public String getDetails(){
    return this.maker + " "  + this.model;
  }
}