--liquibase formatted sql
--changeset AlexFrost:insert-value-person

INSERT INTO `liquibase`.`address` (`city`, `street`, `house`, `apartment`, person_id) VALUES ('Mogilev', 'Lenina', '45', '22', 1);
