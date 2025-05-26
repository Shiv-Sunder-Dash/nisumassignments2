DROP DATABASE IF EXISTS day5;
CREATE DATABASE day5;
USE day5;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT
);

INSERT INTO students VALUES (1, 'Ravi', 21);
INSERT INTO students VALUES (2, 'Ramesh', 22);

CREATE TABLE marks (
    student_id INT,
    subject VARCHAR(50),
    marks INT,
    FOREIGN KEY (student_id) REFERENCES students(id)
);

DROP PROCEDURE IF EXISTS getStudentById;
DELIMITER //
CREATE PROCEDURE getStudentById(IN sid INT)
BEGIN
    SELECT * FROM students WHERE id = sid;
END //
DELIMITER ;

