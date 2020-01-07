CREATE DATABASE sampleDB;
USE sampleDB;

CREATE TABLE IF NOT EXISTS employee (
  employee_id INT PRIMARY KEY ,
  employee_name VARCHAR(50),
  age INT
);

INSERT INTO employee (employee_id, employee_name, age)
VALUES (1, 'Tom', 30);

select * from employee;
