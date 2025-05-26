SELECT c.CourseName, s.FirstName, s.LastName
FROM Courses c
LEFT JOIN Enrollments e ON c.CourseID = e.CourseID
LEFT JOIN Students s ON e.StudentID = s.StudentID;