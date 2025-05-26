SELECT FirstName, COUNT(*) AS Count
FROM Students
GROUP BY FirstName
HAVING COUNT(*) > 1;