SELECT s.FirstName, s.LastName, c.CourseName
FROM Students s
FULL OUTER JOIN Enrollments e ON s.StudentID = e.StudentID
FULL OUTER JOIN Courses c ON e.CourseID = c.CourseID;