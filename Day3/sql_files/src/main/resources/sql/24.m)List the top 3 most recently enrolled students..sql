SELECT s.FirstName, s.LastName, e.EnrollmentDate
FROM Students s
JOIN Enrollments e ON s.StudentID = e.StudentID
ORDER BY e.EnrollmentDate DESC
LIMIT 3;
