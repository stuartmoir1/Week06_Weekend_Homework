// Class
import java.util.*;
import behaviours.*;

public class Shop{

  // Instance variables.
  private String name;
  private ArrayList<Sellable> stock;

  // Constructor
  public Shop(String name){
    this.name = name;
    this.stock = new ArrayList<Sellable>();
  }

  public String getName(){
    return this.name;
  }

  public int stockCount(){
    return stock.size();
  }

  public void add(Sellable item){
    stock.add(item);
  }

  public void remove(Sellable item){
    stock.remove(item);
  }

  public void clear(){
    stock.clear();
  }
}