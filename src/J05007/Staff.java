package J05007;
// Một nhân viên làm việc trong công ty được lưu lại các thông tin sau:

// Mã nhân viên: được gán tự động tăng, bắt đầu từ 00001
// Họ tên: Xâu ký tự không quá 40 chữ cái.
// Giới tính: Nam hoặc Nu
// Ngày sinh: đúng theo chuẩn dd/mm/yyyy
// Địa chỉ: Xâu ký tự không quá 100 chữ cái
// Mã số thuế: Dãy số có đúng 10 chữ số
// Ngày ký hợp đồng: đúng theo chuẩn dd/mm/yyyy
// Viết chương trình nhập danh sách nhân viên (không nhập mã) sau đó sắp xếp theo thứ tự ngày sinh từ già nhất
//  đến trẻ nhất và in ra màn hình danh sách đối tượng nhân viên đã sắp xếp.

public class Staff implements Comparable<Staff> {
    private String id, name, sex, date, address, taxId, signDate;
    private static int cnt = 0;
    private int day, month, year;

    public Staff() {
    }

    public Staff(String name, String sex, String date, String address, String taxId, String signDate) {
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.address = address;
        this.taxId = taxId;
        this.signDate = signDate;
        String[] res = date.split("/");
        day = Integer.parseInt(res[0]);
        month = Integer.parseInt(res[1]);
        year = Integer.parseInt(res[2]);
    }

    public void setId() {
        this.id = String.format("%05d", ++cnt);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDate(String date) {
        this.date = date;
        if (this.date.charAt(1) == '/')
            this.date = "0" + this.date;
        if (this.date.charAt(4) == '/')
            this.date = this.date.substring(0, 3) + "0" + this.date.substring(3);
    }

    public String getDate() {
        return date;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    public String getSignDate() {
        return signDate;
    }

    public int getOld() {
        String[] num = date.trim().split("/");
        String res = "";
        for (String x : num) {
            res += x;
        }
        return Integer.parseInt(res);
    }

    // 00003 Hoang Thi C Nu 04/02/1981 Mo Lao-Ha Dong-Ha Noi 8333012347 22/08/2011

    // 00001 Nguyen Van A Nam 22/10/1982 Mo Lao-Ha Dong-Ha Noi 8333012345 31/12/2013

    // 00002 Ly Thi B Nu 15/10/1988 Mo Lao-Ha Dong-Ha Noi 8333012346 22/08/2011

    @Override
    public String toString() {
        String res = String.format("%s %s %s %s %s %s %s", id, name, sex, date, address, taxId, signDate);
        return res;
    }

    @Override
    public int compareTo(Staff other) {
        if (this.year != other.year) {
            return this.year - other.year;
        }
        if (this.month != other.month) {
            return this.month - other.month;
        }
        if (this.day != other.day) {
            return this.day - other.day;
        }
        return this.id.compareTo(other.id);
    }
}
