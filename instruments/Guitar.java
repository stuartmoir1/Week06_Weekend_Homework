// Class
package instruments;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {
  
  // Instance variables.
  private String maker;
  private String model;
  private int numStrings;
  private int numPickups;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public Guitar(String maker, String model, int numStrings, int numPickups, int priceBuy, int priceSell){
    super(maker, model, priceBuy, priceSell);
    this.numStrings = numStrings;
    this.numPickups = numPickups;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Twang!";
  }

  public int getNumStrings(){
    return this.numStrings;
  }

  public int getNumPickups(){
    return this.numPickups;
  }

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}