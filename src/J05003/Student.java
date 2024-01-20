package J05003;

// Hàm khởi tạo không có tham số, gán các giá trị thuộc tính ở trạng thái mặc định 
// (xâu ký tự rỗng, giá trị số bằng 0).

// Đọc thông tin N sinh viên từ bàn phím (không có mã sinh viên) 
// và in ra lần lượt màn hình mỗi dòng 1 sinh viên theo đúng thứ tự ban đầu.
// Trong đó Mã SV được tự tạo ra theo quy tắc thêm mã B20DCCN sau đó là giá trị 
// nguyên tự động tăng tính từ 001(tối đa là 099).
//  Ngày sinh được chuẩn hóa về dạng dd/mm/yyyy

public class Student {
    private String id, name, date, classId;
    private double gpa;
    private static int cnt = 0;

    public Student() {
        this.id = "";
        this.name = "";
        this.date = "";
        this.classId = "";
        this.gpa = 0;
    }

    public String getId() {
        id = String.format("B20DCCN%03d", ++cnt);
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    // B20DCCN001 Nguyen Van An D20CQCN01-B 02/12/2002 3.19
    @Override
    public String toString() {
        String res = String.format("%s %s %s %s %.2f", getId(), name, classId, date, gpa);
        return res;
    }
}
