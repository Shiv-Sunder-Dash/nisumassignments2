public class CourseInfo {
    private String courseName;
    private String instructor;
    private String grade;
    public CourseInfo(String courseName, String instructor, String grade) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.grade = grade;
    }
    public String getCourseName() { return courseName; }
    public String getInstructor() { return instructor; }
    public String getGrade() { return grade; }
}
