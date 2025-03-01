import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Represents a medication in the pharmacy inventory.
 */

public class Medication {
    private String id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;


    /**
     * Constructs a new Medication.
     *
     * @param id             The unique identifier.
     * @param name           The name of the medication.
     * @param dose           The dose of the medication.
     * @param quantityInStock The quantity of the medication in stock.
     */

    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        long randomDays = ThreadLocalRandom.current().nextLong(-365, 366);
        this.expiryDate = LocalDate.now().plusDays(randomDays);
    }

    /**
     * Gets the unique identifier.
     *
     * @return The unique identifier.
     */

    public String getId() {
        return id;
    }

    /**
     * Gets the name of the medication.
     *
     * @return The name of the medication.
     */

    public String getName() {
        return name;
    }

    /**
     * Gets the dose of the medication.
     *
     * @return The dose of the medication.
     */

    public String getDose() {
        return dose;
    }

    /**
     * Gets the quantity of the medication in stock.
     *
     * @return The quantity of the medication in stock.
     */

    public int getQuantityInStock() {
        return quantityInStock;
    }

    /**
     * Sets the quantity of the medication in stock.
     *
     * @param quantityInStock The quantity of the medication in stock.
     */

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    /**
     * Gets the expiry date of the medication.
     *
     * @return The expiry date of the medication.
     */
    
    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dose='" + dose + '\'' +
                ", quantityInStock=" + quantityInStock +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
