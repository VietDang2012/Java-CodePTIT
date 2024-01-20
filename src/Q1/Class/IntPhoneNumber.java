package Q1.Class;

public class IntPhoneNumber extends PhoneNumber {
    private String intId;
    private String intPhoneNumber;

    public IntPhoneNumber() {
    }

    public IntPhoneNumber(String intId, String localId, String localNumber) {
        super(localId, localNumber);
        this.intId = intId;
        this.intPhoneNumber = String.format("%s-%s-%s", intId, localId, localNumber);
        this.id = String.format("NUM%04d", cnt);
    }

    public String getId() {
        return super.getId();
    }

    public String getIntId() {
        return intId;
    }

    public String getIntPhoneNumber() {
        return intPhoneNumber;
    }

    public void setIntId(String intId) {
        this.intId = intId;
    }

    public void setIntPhoneNumber(String intPhoneNumber) {
        this.intPhoneNumber = intPhoneNumber;
    }

    @Override
    public String formattedPhoneNumber() {
        return intPhoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s", id, formattedPhoneNumber());
    }
}
