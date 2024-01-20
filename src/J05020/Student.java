package J05020;

// Thông tin về mỗi sinh viên gồm:

// Mã sinh viên: dãy ký tự không có khoảng trống (không quá 15). Đảm bảo không trùng nhau.
// Họ và tên: độ dài không quá 100
// Lớp: dãy ký tự không có khoảng trống (không quá 15)
// Email: dãy ký tự không có khoảng trống (không quá 15)
// Hãy nhập danh sách sinh viên và sắp xếp theo lớp tăng dần (thứ tự từ điển)

public class Student implements Comparable<Student> {
    private String id, name, classId, email;

    public Student() {
    }

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassId() {
        return classId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + classId + " " + email;
    }

    @Override
    public int compareTo(Student other) {
        if (this.classId.equals(other.classId)) {
            return this.id.compareTo(other.id);
        } else {
            return this.classId.compareTo(other.classId);
        }
    }
}
