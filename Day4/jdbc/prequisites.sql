DROP DATABASE IF EXISTS college_db;
CREATE DATABASE college_db;
USE college_db;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    date_of_birth DATE,
    major VARCHAR(50),
    admission_date DATE,
    gpa DECIMAL(3,2)
);

CREATE TABLE courses (
    id INT PRIMARY KEY,
    course_code VARCHAR(10) UNIQUE NOT NULL,
    course_name VARCHAR(100) NOT NULL,
    department VARCHAR(50) NOT NULL,
    credits INT NOT NULL,
    instructor VARCHAR(100) NOT NULL,
    max_capacity INT
);

CREATE TABLE enrollments (
    student_id INT,
    course_id INT,
    semester VARCHAR(20) NOT NULL,
    enrollment_date DATE NOT NULL,
    grade VARCHAR(2),
    PRIMARY KEY (student_id, course_id, semester),
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (course_id) REFERENCES courses(id)
);

CREATE TABLE products (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    category VARCHAR(50),
    price DECIMAL(10,2)
);

INSERT INTO students VALUES 
(1, 'Amit Kumar', 'amit@example.com', '2002-05-12', 'CSE', '2020-08-01', 8.5),
(2, 'Priya Singh', 'priya@example.com', '2001-11-23', 'ECE', '2019-08-01', 9.0);

INSERT INTO courses VALUES 
(101, 'CSE101', 'Data Structures', 'CSE', 4, 'Dr. Rao', 60),
(102, 'ECE202', 'Signals & Systems', 'ECE', 3, 'Dr. Menon', 40);

INSERT INTO enrollments VALUES 
(1, 101, 'Fall 2024', '2024-07-15', 'A'),
(2, 102, 'Fall 2024', '2024-07-15', 'B+');

INSERT INTO products (name, category, price) VALUES 
('Pen', 'Stationery', 10.00),
('Notebook', 'Stationery', 50.00),
('Headphones', 'Electronics', 1500.00);
