import java.sql.Date;
public class Student {
    private int id;
    private String name;
    private String email;
    private Date dob;
    private String major;
    private Date admissionDate;
    private double gpa;
    public Student(int id, String name, String email, Date dob, String major, Date admissionDate, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.major = major;
        this.admissionDate = admissionDate;
        this.gpa = gpa;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public Date getDob() { return dob; }
    public String getMajor() { return major; }
    public Date getAdmissionDate() { return admissionDate; }
    public double getGpa() { return gpa; }
}
