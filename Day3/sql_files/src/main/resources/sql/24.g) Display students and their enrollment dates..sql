SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
JOIN Enrollments e ON s.StudentID = e.StudentID;