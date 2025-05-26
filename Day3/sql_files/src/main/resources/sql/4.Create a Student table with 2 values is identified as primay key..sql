CREATE TABLE Student (
    StudentID INT NOT NULL,
    CourseID INT NOT NULL,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    EnrollmentDate DATE,
    PRIMARY KEY (StudentID, CourseID)
);
