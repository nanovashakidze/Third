public class Main {
    public static void main(String[] args) {
        Department ITDepartment = new Department();
        ITDepartment.setName("IT Department");
        ITDepartment.setEmployeeCount(200);
        ITDepartment.setCeoName("Mark Zuckerberg");
        System.out.println(ITDepartment);

        Department BusinessDepartment = new Department();
        BusinessDepartment.setName("Business Department");
        BusinessDepartment.setEmployeeCount(200);
        BusinessDepartment.setCeoName("Mark Zuckerberg");
        System.out.println(BusinessDepartment);

        System.out.println(ITDepartment.equals(BusinessDepartment));
    }
}