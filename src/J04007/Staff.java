package J04007;

public class Staff {
    private String ID, Name, Sex, dateOfBirth, Address, taxID, contractDate;

    public Staff(String Name, String Sex, String dateOfBirth, String Address, String taxID, String contractDate) {
        this.ID = "00001";
        this.Name = Name;
        this.Sex = Sex;
        this.dateOfBirth = dateOfBirth;
        this.Address = Address;
        this.taxID = taxID;
        this.contractDate = contractDate;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getSex() {
        return Sex;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    public String getTaxID() {
        return taxID;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }

    public String getContractDate() {
        return contractDate;
    }
}
