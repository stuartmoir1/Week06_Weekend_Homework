// Class
package accessories;
import behaviours.*;

public class PianoTuner extends Accessory implements Sellable{

  // Instance variables.
  private String maker;
  private String model;
  private String pitch;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public PianoTuner(String make, String model, String pitch, int priceBuy, int priceSell){
    super(make, model, priceBuy, priceSell);
    this.pitch = pitch;
  }

  // Methods

  public String getPitch(){
    return this.pitch;
  }

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}