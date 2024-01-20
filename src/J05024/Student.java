package J05024;

public class Student {
    private String id, name, email, classId, majorId;

    public Student() {
    }

    public Student(String id, String name, String classId, String email) {
        this.id = id;
        this.name = name;
        this.classId = classId;
        this.email = email;
        this.majorId = id.substring(3, 7);
        if (majorId.equals("DCKT")) {
            this.majorId = "KE TOAN";
        } else if (majorId.equals("DCVT")) {
            this.majorId = "VIEN THONG";
        } else if (majorId.equals("DCDT")) {
            this.majorId = "DIEN TU";
        } else if (classId.charAt(0) == 'D') {
            if (majorId.equals("DCCN")) {
                this.majorId = "CONG NGHE THONG TIN";
            } else {
                this.majorId = "AN TOAN THONG TIN";
            }
        }
    }

    public String getClassId() {
        return classId;
    }

    public String getMajorId() {
        return majorId;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", id, name, classId, email);
    }

}