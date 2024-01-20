package Q1.Class;

import Q1.Interface.IPhoneNumber;

public class PhoneNumber implements IPhoneNumber {
    private String phoneNumber;
    protected String id;
    private String localId, localNumber;
    public static int cnt = 0;

    public PhoneNumber() {
    }

    public PhoneNumber(String localId, String localNumber) {
        this.localId = localId;
        this.localNumber = localNumber;
        this.phoneNumber = String.format("0%s-%s", localId, localNumber);
        this.id = String.format("NUM%04d", ++cnt);
    }

    public String getLocalId() {
        return localId;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public void setLocalNumber(String localNumber) {
        this.localNumber = localNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String formattedPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %s", id, formattedPhoneNumber());
    }
}
