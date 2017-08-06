// Class
package accessories;
import behaviours.*;

public class SaxophoneReed extends Accessory implements Sellable{

  // Instance variables.
  private String maker;
  private String model;
  private int strength;
  private int number;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public SaxophoneReed(String make, String model, int strength, int number, int priceBuy, int priceSell){
    super(make, model, priceBuy, priceSell);
    this.strength = strength;
    this.number = number;
  }

  // Methods

  public int getStrength(){
    return this.strength;
  }

  public int getNumber(){
    return this.number;
  }

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}