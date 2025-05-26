SELECT s.FirstName, s.LastName, c.CourseName
FROM Students s
RIGHT JOIN Enrollments e ON s.StudentID = e.StudentID
RIGHT JOIN Courses c ON e.CourseID = c.CourseID