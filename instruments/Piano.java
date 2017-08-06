// Class
package instruments;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable{
  
  // Instance variables.
  private String maker;
  private String model;
  private int height;
  private int width;
  private int depth;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public Piano(String maker, String model, int height, int width, int depth, int priceBuy,int priceSell){
    super(maker, model, priceBuy, priceSell);
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

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}