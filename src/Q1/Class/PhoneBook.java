package Q1.Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Q1.Interface.ChucNang;

public class PhoneBook implements ChucNang {
    private List<PhoneNumber> phoneNumbers = new ArrayList<>();

    public PhoneBook() {
        phoneNumbers.add(new PhoneNumber("24", "36407515"));
        phoneNumbers.add(new PhoneNumber("227", "3821213"));
        phoneNumbers.add(new IntPhoneNumber("84", "24", "36407515"));
    }

    @Override
    public void addPhoneNumber(PhoneNumber phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }

    @Override
    public List<PhoneNumber> findNumbersByAreaCode(String areaCode) {
        List<PhoneNumber> foundNumbers = new ArrayList<>();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.getLocalId().equals(areaCode)) {
                foundNumbers.add(phoneNumber);
            }
        }
        return foundNumbers;
    }

    @Override
    public List<PhoneNumber> listAllNumbers() {
        return phoneNumbers;
    }

    @Override
    public int countNumbersByAreaCode(String areaCode) {
        int cnt = 0;
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.getLocalId().equals(areaCode)) {
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public List<PhoneNumber> searchNumbersBySuffix(String suffix) {
        List<PhoneNumber> foundNumbers = new ArrayList<>();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (phoneNumber.formattedPhoneNumber().endsWith(suffix)) {
                foundNumbers.add(phoneNumber);
            }
        }
        return foundNumbers;
    }

    @Override
    public void sortPhoneNumbers() {
        Collections.sort(phoneNumbers, new Comparator<>() {
            @Override
            public int compare(PhoneNumber a, PhoneNumber b) {
                return a.formattedPhoneNumber().compareTo(b.formattedPhoneNumber());
            }
        });
    }

    @Override
    public List<PhoneNumber> removeNumberById(String id) {
        List<PhoneNumber> keepNumbers = new ArrayList<>();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            if (!phoneNumber.getId().toLowerCase().equals(id.toLowerCase())) {
                keepNumbers.add(phoneNumber);
            }
        }
        phoneNumbers = keepNumbers;
        return phoneNumbers;
    }

    @Override
    public void updateNumberById(String id, PhoneNumber newPhoneNumber) {
        for (int i = 0; i < phoneNumbers.size(); i++) {
            PhoneNumber phoneNumber = phoneNumbers.get(i);
            if (phoneNumber.getId().toLowerCase().equals(id.toLowerCase())) {
                phoneNumbers.set(i, newPhoneNumber);
                break;
            }
        }
    }
}
