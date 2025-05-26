SELECT LastName, COUNT(*) AS Count
FROM Students
GROUP BY LastName
HAVING COUNT(*) > 1;