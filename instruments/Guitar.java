// Class
package instruments;
import behaviours.*;

public class Guitar implements Playable{
  
  // Instance variables.
  private String maker;
  private String model;
  private int numStrings;
  private int numPickups;

  // Constructor
  public Guitar(String maker, String model, int numStrings, int numPickups){
    this.maker = maker;
    this.model = model;
    this.numStrings = numStrings;
    this.numPickups = numPickups;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Twang!";
  }

  public String getMakeModel(){
    return this.maker + " "  + this.model;
  }

  public int getNumStrings(){
    return this.numStrings;
  }

  public int getNumPickups(){
    return this.numPickups;
  }
}