package game.inventory;

/** Manages a collection of Items in the game shop. */
public class Inventory {
    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    /** Adds an item to the inventory if there is space. */
    public void addItem(Item item) {
        if (item == null) {
            System.out.println("WARNING: Cannot add a null item to inventory.");
            return;
        }
        if (count >= items.length) {
            System.out.println("WARNING: Inventory is full. Item was not added.");
            return;
        }
        items[count] = item;
        count++;
    }

    /** Displays name, genre, and stock count for every item. */
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    item.getName(), item.getGenre(), item.getStockCount());
        }
    }

    /** Prints each item's name and package-private serial code for auditing. */
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.printf("%-15s -> %s%n", item.getName(), item.getSerialCode());
        }
    }
}
