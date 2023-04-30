import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Department {
    private String name;
    private int employeeCount;
    private String ceoName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public int getEmployeeCount() {
        return this.employeeCount;
    }

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public String getCeoName() {
        return this.ceoName;
    }

    @Override
    public String toString() {
        return "Ceo of the department is: " + this.getCeoName();
    }
    public boolean equals(Department depObj) {
        return Objects.equals(depObj.getCeoName(), this.getCeoName());
    }
}
