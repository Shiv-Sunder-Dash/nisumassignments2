CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    Email VARCHAR(100) UNIQUE NOT NULL,
    PhoneNumber VARCHAR(15),
    HireDate DATE NOT NULL,
    JobTitle VARCHAR(50),
    Department VARCHAR(50),
    Salary DECIMAL(10, 2)
);
