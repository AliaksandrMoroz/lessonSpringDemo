--liquibase formatted sql
--changeset AlexFrost:create-table person

CREATE TABLE persons
(
    id           BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    name         VARCHAR(255)          NULL,
    lastname     VARCHAR(255)          NULL,
    email        VARCHAR(255)          NULL,
    phone_number VARCHAR(255)          NULL
);