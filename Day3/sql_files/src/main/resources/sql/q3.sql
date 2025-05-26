
CREATE TABLE employee (
    emp_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    department VARCHAR(50),
    hire_date DATE NOT NULL
);

CREATE TABLE salary_details (
    salary_id INT AUTO_INCREMENT PRIMARY KEY,
    emp_id INT,
    basic_salary DECIMAL(10, 2) NOT NULL,
    hra DECIMAL(10, 2),
    allowances DECIMAL(10, 2),
    deductions DECIMAL(10, 2),
    net_salary DECIMAL(10, 2),
    payment_date DATE NOT NULL,
    FOREIGN KEY (emp_id) REFERENCES employee(emp_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE
);


