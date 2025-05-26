SELECT c.CourseName, COUNT(e.StudentID) AS EnrolledCount
FROM Courses c
LEFT JOIN Enrollments e ON c.CourseID = e.CourseID
GROUP BY c.CourseName;