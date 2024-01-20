package J05006;

public class Employee {
    private static int cnt = 1;

    private int employeeId;
    private String fullName, gender, dateOfBirth, address, taxId, contractDate;

    public Employee(String fullName, String gender, String dateOfBirth, String address, String taxId,
            String contractDate) {
        this.employeeId = cnt++;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxId = taxId;
        this.contractDate = contractDate;
        if (this.dateOfBirth.charAt(1) == '/') {
            this.dateOfBirth = "0" + this.dateOfBirth;
        }
        if (this.dateOfBirth.charAt(4) == '/') {
            this.dateOfBirth = this.dateOfBirth.substring(0, 3) + "0" + this.dateOfBirth.substring(3);
        }
        if (this.contractDate.charAt(1) == '/') {
            this.contractDate = "0" + this.contractDate;
        }
        if (this.contractDate.charAt(4) == '/') {
            this.contractDate = this.contractDate.substring(0, 3) + "0" + this.contractDate.substring(3);
        }
    }

    @Override
    public String toString() {
        return String.format("%05d %s %s %s %s %s %s", employeeId, fullName, gender, dateOfBirth, address, taxId,
                contractDate);
    }
}
