public class Employee {
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private String jobTitle;

    public Employee(int employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.jobTitle = jobTitle;
    }
}