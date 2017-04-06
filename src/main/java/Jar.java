import java.util.Random;

class Jar {
  public String itemName;
  public int MAX_ITEMS;
  
  //constructor for the jar
  public Jar (String itemName, int MAX_ITEMS) {
    this.itemName = itemName;
    this.MAX_ITEMS = MAX_ITEMS;
  }
  
  public String getItemName() {
    return itemName;
  }
  
  public int getMaxItems() {
    return MAX_ITEMS;
  }
  
  //fills the jar with a random amount of objects between 1 and the max number specified
  public int fillJar() {
    Random random = new Random();
    int minItems = 1;
    int itemsInJar = random.nextInt(MAX_ITEMS - minItems) + minItems;
    return itemsInJar;
  }
  
}