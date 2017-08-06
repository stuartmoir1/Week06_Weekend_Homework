// Class
package instruments;
import behaviours.*;

public class Saxophone extends Instrument implements Playable, Sellable{

  // Instance variables.
  private String maker;
  private String model;
  private String body;
  private String tuning;
  private int priceBuy;
  private int priceSell;

  // Constructor
  public Saxophone(String maker, String model, String body, String tuning, int priceBuy, int priceSell){
    super(maker, model, priceBuy, priceSell);
    this.body = body;
    this.tuning = tuning;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Toot toot!";
  }

  public String getBody(){
    return this.body;
  }

  public String getTuning(){
    return this.tuning;
  }

  public int calculateMarkup(){
    return super.priceSell - super.priceBuy;
  }
}