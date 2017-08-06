// Class
package instruments;
import behaviours.*;

public class Piano extends Instrument implements Playable{
  
  // Instance variables.
  private String maker;
  private String model;
  private int height;
  private int width;
  private int depth;

  // Constructor
  public Piano(String maker, String model, int height, int width, int depth){
    super(maker, model);
    this.height = height;
    this.width = width;
    this.depth = depth;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Plinky plonk!";
  }

  public String getDimensions(){
    return this.height + " " + this.width + " " + this.depth;
  }

}