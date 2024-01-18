package hashtable;

public class Main {
  public static void main(String[] args) {
    HashTable myHashTable = new HashTable();
    myHashTable.set("nails", 100);
    myHashTable.set("tile", 50);
    myHashTable.set("lumber", 80);

    myHashTable.set("bolts", 200);
    myHashTable.set("screws", 140);
    myHashTable.printTable();

    System.out.println("value of screws are " + myHashTable.get("screws"));
    System.out.println("value of lumber are " + myHashTable.get("lumber"));
    System.out.println("value of bolts are " + myHashTable.get("bolts"));
    System.out.println("value of screwdrivers are " + myHashTable.get("screwdrivers"));

    myHashTable.remove("tile");
    myHashTable.printTable();

    myHashTable.set("tile", 50);
    System.out.println("All Keys: " + myHashTable.keys());
  } 
}
