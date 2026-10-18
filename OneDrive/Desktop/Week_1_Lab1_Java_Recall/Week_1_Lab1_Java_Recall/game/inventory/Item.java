package game.inventory;

/** Represents a single game title available in the shop. */
public class Item {
    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = Math.max(0, stockCount);
        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // Package-private: accessible only to classes in game.inventory.
    String getSerialCode() {
        return serialCode;
    }

    private boolean isAvailable(int quantity) {
        return quantity >= 0 && stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (quantity <= 0) {
            System.out.printf("WARNING: Sale quantity must be positive for %s. Requested: %d%n", name, quantity);
            return;
        }
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.printf("Sold %d copy/copies of %s. Remaining stock: %d%n", quantity, name, stockCount);
        } else {
            System.out.printf("WARNING: Not enough stock for %s. Requested: %d, Available: %d%n",
                    name, quantity, stockCount);
        }
    }
}
