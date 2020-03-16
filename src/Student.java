public class Student {
    private String fullName;
    private String MSSV;
    private String classes;

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", MSSV='" + MSSV + '\'' +
                ", classes='" + classes + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private String phoneNumber;
    private String email;
    private String address;

    public Student() {
    }

    public Student(String fullName, String MSSV, String classes, String phoneNumber, String email, String address) {
        this.fullName = fullName;
        this.MSSV = MSSV;
        this.classes = classes;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
