// Class
package instruments;
import behaviours.*;

public class Guitar implements Playable{
  
  // Instance variables.
  private String maker;
  private String model;

  // Constructor
  public Guitar(String maker, String model){
    this.maker = maker;
    this.model = model;
  }

  // Methods

  // Method required by interface contract.
  public String play(){
    return "Twang!";
  }

  public String getDetails(){
    return this.maker + " "  + this.model;
  }
    
}