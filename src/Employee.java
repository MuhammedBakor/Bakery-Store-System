import java.time.LocalDate;

public class Employee {
    String fullName;
    int age;
    String phoneNumber;
    String email;
    String address;
    int salary;
    LocalDate dateOfEmployed;
    boolean salaryIsPaid;
    String Gender;
    private boolean isPresent;

    public boolean isAvailableToWork(){
        return isPresent;
    }

    public void addFingerPrint(){
        isPresent = true;
    }
}
