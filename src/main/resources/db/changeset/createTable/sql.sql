--liquibase formatted sql
--changeset AlexFrost:create-tables

CREATE TABLE employee(
                         id INT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(40)
);

CREATE TABLE branch(
                       id INT PRIMARY KEY,
                       name VARCHAR(40),
                       emp_id INT REFERENCES employee(id) ON DELETE CASCADE
);