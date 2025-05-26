SELECT CONCAT(s.FirstName, ' ', s.LastName) AS FullName, c.CourseName
FROM Students s
JOIN Enrollments e ON s.StudentID = e.StudentID
JOIN Courses c ON e.CourseID = c.CourseID
ORDER BY FullName;