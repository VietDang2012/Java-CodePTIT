package Q1.Interface;

import java.util.List;

import Q1.Class.PhoneNumber;

public interface ChucNang {
    void addPhoneNumber(PhoneNumber phoneNumber);

    List<PhoneNumber> findNumbersByAreaCode(String areaCode);

    List<PhoneNumber> listAllNumbers();

    int countNumbersByAreaCode(String areaCode);

    List<PhoneNumber> searchNumbersBySuffix(String suffix);

    void sortPhoneNumbers();

    List<PhoneNumber> removeNumberById(String id);

    void updateNumberById(String id, PhoneNumber newPhoneNumber);
}
