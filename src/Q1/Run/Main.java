package Q1.Run;

import java.util.List;
import java.util.Scanner;

import Q1.Class.IntPhoneNumber;
import Q1.Class.PhoneBook;
import Q1.Class.PhoneNumber;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        while (true) {
            System.out.println("----------------------------");
            System.out.println("0.Thoat");
            System.out.println("1.Nhap so dien thoai");
            System.out.println("2.In ra danh sach so dien thoai");
            System.out.println("3.Tim so dien thoai theo ma vung");
            System.out.println("4.Dem so dien thoai co chung dia chi vung");
            System.out.println("5.Tim kiem so co duoi theo yeu cau");
            System.out.println("6.Sap xep so dien thoai");
            System.out.println("7.Xoa so dien thoai theo id");
            System.out.println("8.Sua so dien thoai theo id");
            System.out.println("Ban hay chon tu 0 - 8:");
            Scanner sc = new Scanner(System.in);
            int chon = Integer.parseInt(sc.nextLine());
            System.out.println("----------------------------");
            switch (chon) {
                case 1: {
                    System.out.println("So dien thoai cua ban la Noi dia (N) hay Quoc te (Q):");
                    String noq = sc.nextLine();
                    if (noq.equals("N")) {
                        phoneBook.addPhoneNumber(new PhoneNumber(sc.nextLine(), sc.nextLine()));
                    } else {
                        phoneBook.addPhoneNumber(new IntPhoneNumber(sc.nextLine(), sc.nextLine(), sc.nextLine()));
                    }
                    break;
                }
                case 2: {
                    System.out.println("Danh sach so dien thoai:");
                    List<PhoneNumber> phoneNumbersList = phoneBook.listAllNumbers();
                    for (PhoneNumber phoneNumber : phoneNumbersList) {
                        System.out.println(phoneNumber);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Nhap ma vung ma ban muon tim:");
                    String areaCode = sc.nextLine();
                    System.out.println("So dien thoai theo ma vung ban tim gom co:");
                    List<PhoneNumber> foundNumbers = phoneBook.findNumbersByAreaCode(areaCode);
                    for (PhoneNumber foundNumber : foundNumbers) {
                        System.out.println(foundNumber);
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap ma vung ma ban muon tim:");
                    String areaCode = sc.nextLine();
                    System.out.println("So dien thoai co ma vung giong nhau co:");
                    System.out.println(phoneBook.countNumbersByAreaCode(areaCode));
                    break;
                }
                case 5: {
                    System.out.println("Nhap duoi so ma ban muon tim:");
                    String suffix = sc.nextLine();
                    System.out.println("So dien thoai co duoi so nay bao gom:");
                    List<PhoneNumber> foundNumbers = phoneBook.searchNumbersBySuffix(suffix);
                    for (PhoneNumber foundNumber : foundNumbers) {
                        System.out.println(foundNumber);
                    }
                    break;
                }
                case 6: {
                    phoneBook.sortPhoneNumbers();
                    System.out.println("Sap xep thanh cong");
                    break;
                }
                case 7: {
                    System.out.println("Nhap id so dien thoai can xoa");
                    String removeId = sc.nextLine();
                    List<PhoneNumber> keepNumbers = phoneBook.removeNumberById(removeId);
                    System.out.println("Xoa thanh cong");
                    for (PhoneNumber phoneNumber : keepNumbers) {
                        System.out.println(phoneNumber);
                    }
                    break;
                }
                case 8: {
                    System.out.println("Nhap id so dien thoai can xoa");
                    String updateId = sc.nextLine();
                    System.out.println("Nhap cac noi dung moi can doi");
                    PhoneNumber newPhoneNumber = new PhoneNumber(sc.nextLine(), sc.nextLine());
                    phoneBook.updateNumberById(updateId, newPhoneNumber);
                    System.out.println("Sua doi thanh cong");
                    break;
                }
                default: {
                    System.out.println("Tam biet");
                    sc.close();
                    System.exit(0);
                }
            }
        }
    }
}
