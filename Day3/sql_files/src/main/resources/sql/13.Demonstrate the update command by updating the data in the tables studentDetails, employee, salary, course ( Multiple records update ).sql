UPDATE studentDetails
SET email = CONCAT(SUBSTRING_INDEX(email, '@', 1), '@newdomain.com')
WHERE courseId = 101;
