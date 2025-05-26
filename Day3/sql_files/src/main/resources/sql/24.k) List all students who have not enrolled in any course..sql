SELECT * FROM Students
WHERE StudentID NOT IN (
    SELECT DISTINCT StudentID FROM Enrollments
);
