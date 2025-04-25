import java.time.LocalDate;

public class Electricity {
    String name;
    String Type;
    LocalDate chargeDate;
    LocalDate expiryDate;
    Double wattsQuantity;

    public boolean isWattsNotEmpty(){
        return wattsQuantity != 0.0;
    }
}
