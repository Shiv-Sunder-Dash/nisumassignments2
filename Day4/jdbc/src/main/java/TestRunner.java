import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        System.out.println("Testing DB connection:");
        System.out.println(Q1.getConnection() != null ? "Connected successfully" : "Connection failed");

        System.out.println("\nTesting Q2:");
        Q2 q2 = new Q2();
        Student s = q2.getStudentById(1);
        System.out.println(s != null ? s.getName() + " - " + s.getEmail() : "Student not found");

        System.out.println("\nTesting Q3:");
        Q3 q3 = new Q3();
        Student newStudent = new Student(3, "Ravi Verma", "ravi@example.com",
                java.sql.Date.valueOf("2003-01-20"), "IT", java.sql.Date.valueOf("2021-08-01"), 7.5);
        System.out.println("Insert: " + q3.insertStudent(newStudent));
        newStudent = new Student(3, "Ravi V", "ravi.v@example.com",
                java.sql.Date.valueOf("2003-01-20"), "IT", java.sql.Date.valueOf("2021-08-01"), 8.0);
        System.out.println("Update: " + q3.updateStudent(newStudent));
        System.out.println("Delete: " + q3.deleteStudent(3));


        System.out.println("\nTesting Q4:");
        Q4 q4 = new Q4();
        System.out.println("Transfer: " + q4.transferCredits(1, 2, 0.5)); // Now allowed: double

        System.out.println("\nTesting Q5:");
        Q5 q5 = new Q5();
        List<CourseInfo> courses = q5.getCoursesByStudent(1);
        for (CourseInfo ci : courses) {
            System.out.println(ci.getCourseName() + " - " + ci.getInstructor() + " - " + ci.getGrade());
        }

        System.out.println("\nTesting Q6:");
        Q6 q6 = new Q6();
        List<Product> products = q6.searchProducts("Stationery", 10.0, 100.0);
        for (Product p : products) {
            System.out.println(p.getName() + " - Rs." + p.getPrice());
        }
    }
}
