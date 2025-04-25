import java.time.LocalDate;

public class Water {
    String type;
    Double waterQuantity;
    LocalDate chargeDate;
    LocalDate expiryDate;

    public boolean isWaterNotEmpty(){
        return waterQuantity != 0.0;
    }
}
