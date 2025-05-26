
SELECT s.StudentID, s.FirstName, s.LastName
FROM Students s
WHERE s.StudentID IN (
    SELECT e1.StudentID
    FROM Enrollments e1
    JOIN Courses c1 ON e1.CourseID = c1.CourseID
    WHERE c1.CourseName = 'Database Systems'
)
AND s.StudentID IN (
    SELECT e2.StudentID
    FROM Enrollments e2
    JOIN Courses c2 ON e2.CourseID = c2.CourseID
    WHERE c2.CourseName = 'Data Structures'
);
