// Class
package accessories;
import behaviours.*;

public class GuitarStringSet extends Accessory implements Sellable{

  // Instance variables.
  private String maker;
  private String model;
  private String gauge;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public GuitarStringSet(String make, String model, String gauge, int priceBuy, int priceSell){
    super(make, model, priceBuy, priceSell);
    this.gauge = gauge;
  }

  // Methods

  public String getGauge(){
    return this.gauge;
  }

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}