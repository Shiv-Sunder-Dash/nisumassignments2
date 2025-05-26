-- 1. Select single column ( sub query asked in question no 18)
SELECT FullName FROM Students;

-- 2. Select multiple columns ( sub query asked in question no 18)
SELECT StudentID, FullName, Email FROM Students;

-- 3. Select all columns ( sub query asked in question no 18)
SELECT * FROM Students;

-- 4. Select using WHERE condition ( sub query asked in question no 18)
SELECT * FROM Students
WHERE CourseID = 101;

-- 5. Select using ORDER BY ( sub query asked in question no 18)
SELECT * FROM Students
ORDER BY FullName ASC;

-- 6. Select using LIMIT and OFFSET ( sub query asked in question no 18)
SELECT * FROM Students
ORDER BY StudentID
LIMIT 5 OFFSET 10;

-- 7. Select using BETWEEN (numeric) ( sub query asked in question no 18)
SELECT * FROM Students
WHERE StudentID BETWEEN 10 AND 20;

-- 7b. Select using BETWEEN (non-numeric) ( sub query asked in question no 18)
SELECT * FROM Students
WHERE FullName BETWEEN 'A' AND 'M';

-- 8. Select using IN ( sub query asked in question no 18)
SELECT * FROM Students
WHERE CourseID IN (101, 103, 105);

-- 9. Select using LIKE ( sub query asked in question no 18)
SELECT * FROM Students
WHERE FullName LIKE 'A%';
