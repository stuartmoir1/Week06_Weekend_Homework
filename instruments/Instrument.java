// Superclass
package instruments;

public abstract class Instrument{
  
  // Instance variables.
  protected String maker;
  protected String model;
  protected int priceBuy;
  protected int priceSell;

  // Constructor
  public Instrument(String maker, String model, int priceBuy, int priceSell){
    this.maker = maker;
    this.model = model;
    this.priceBuy = priceBuy;
    this.priceSell = priceSell;
  }

  // Methods

  public String getMakeModel(){
    return this.maker + " "  + this.model;
  }

  public int getPriceBuy(){
    return this.priceBuy;
  }

  public int getPriceSell(){
    return this.priceSell;
  }
}