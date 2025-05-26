CREATE TABLE Students (
    StudentID INT,
    CourseID INT,
    FullName VARCHAR(100),
    Email VARCHAR(100) UNIQUE,
    PRIMARY KEY (StudentID, CourseID),  -- Composite Primary Key
    FOREIGN KEY (CourseID) REFERENCES Courses(CourseID)
);
