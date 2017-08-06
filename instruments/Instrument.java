// Superclass
package instruments;

public class Instrument{
  
  // Instance variables.
  private String maker;
  private String model;

  // Constructor
  public Instrument(String maker, String model){
    this.maker = maker;
    this.model = model;
  }

  // Methods

  public String getMakeModel(){
    return this.maker + " "  + this.model;
  }
}