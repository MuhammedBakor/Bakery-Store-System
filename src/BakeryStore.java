public class BakeryStore {
    //TODO private Recipe
    boolean isOpen;

    private final Employee employee;
    private final Electricity electricity;
    private final Water water;


    public BakeryStore(Employee employee, Electricity electricity, Water water){
        this.employee = employee;
        this.electricity = electricity;
        this.water = water;
    }

    public String openTheStore(){
        if (!employee.isAvailableToWork()) {
            isOpen = false;
            return "No available employee to open the bakery!";
        }

        if (!electricity.isWattsNotEmpty()) {
            isOpen = false;
            return "Not enough electricity to open the bakery!";
        }

        if (!water.isWaterNotEmpty()) {
            isOpen = false;
            return "Not enough water to open the bakery!";
        }

        isOpen = true;
        return String.format("Bakery opened successfully by %s!", employee.fullName);
    }

    public void closeTheStore(){
        isOpen = false;
    }


}
