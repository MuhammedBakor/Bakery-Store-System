//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee ManaEmployee = new Employee();
        ManaEmployee.fullName = "Mana";
        ManaEmployee.addFingerPrint();

        Electricity electricity = new Electricity();
        electricity.wattsQuantity = 100D;

        Water water = new Water();
        water.waterQuantity = 100D;

        BakeryStore bakeryStore1 = new BakeryStore(
                ManaEmployee,
                electricity,
                water);


        System.out.println(bakeryStore1.openTheStore());

        System.out.println(bakeryStore1.isOpen);

    }

}
