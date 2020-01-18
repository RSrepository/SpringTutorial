DROP DATABASE sampleDB;
CREATE DATABASE sampleDB;
USE sampleDB;

/* 従業員テーブル(第3章で作成) */
CREATE TABLE IF NOT EXISTS employee (
  employee_id INT PRIMARY KEY,
  employee_name VARCHAR(50),
  age INT
);

/* ユーザーマスタ */
CREATE TABLE IF NOT EXISTS m_user (
  user_id VARCHAR(50) PRIMARY KEY ,
  password VARCHAR(100),
  user_name VARCHAR(50),
  birthday DATE,
  age INT,
  marriage BOOLEAN,
  role VARCHAR(50)
);

/* 従業員テーブルのデータ(第3章で作成) */
INSERT INTO employee (employee_id, employee_name, age)
VALUES (1, 'Tom', 30);
/* ユーザーマスタのデータ(アドミン権限) */
INSERT INTO m_user (user_id, password, user_name, birthday, age, marriage, role) VALUES('tom@xxx.co.jp', 'password', 'Tom', '1990-01-01', 28, false,'ROLE_ADMIN');

select * from employee;
select * from m_user;

/* ユーザーマスタのデータ(一般権限) */
INSERT INTO m_user VALUES('tamura@xxx.co.jp', 'password', 'tamtam', '1986-11-05', 31,false,'ROLE_GENERAL');
