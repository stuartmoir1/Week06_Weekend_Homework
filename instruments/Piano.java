// Class
package instruments;
import behaviours.*;

public class Piano implements Playable{
  
  // Instance variables.
  private String maker;
  private String model;

  // Constructor
  public Piano(String maker, String model){
    this.maker = maker;
    this.model = model;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Plinky plonk!";
  }

  public String getDetails(){
    return this.maker + " "  + this.model;
  }

}