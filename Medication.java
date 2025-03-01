import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class Medication {
    private String id;
    private String name;
    private String dose;
    private int quantityInStock;
    private LocalDate expiryDate;

    public Medication(String id, String name, String dose, int quantityInStock) {
        this.id = id;
        this.name = name;
        this.dose = dose;
        this.quantityInStock = quantityInStock;
        long randomDays = ThreadLocalRandom.current().nextLong(-365, 366);
        this.expiryDate = LocalDate.now().plusDays(randomDays);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDose() {
        return dose;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

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
