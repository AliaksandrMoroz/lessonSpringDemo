--liquibase formatted sql
--changeset AlexFrost:create-table Address

CREATE TABLE address
(
    id        BIGINT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    city      VARCHAR(255) NOT NULL,
    street    VARCHAR(255) NOT NULL,
    house     INT          NOT NULL,
    apartment INT          NOT NULL,
    person_id BIGINT       NOT NULL REFERENCES persons (id)
);
