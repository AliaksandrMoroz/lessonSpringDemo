--liquibase formatted sql
--changeset AlexFrost:insert-value-person

INSERT INTO `liquibase`.`address` (`city`, `street`, `house`, `apartment`, person_id) VALUES ('Minsk', 'Lenina', '45', '22', 3);
INSERT INTO `liquibase`.`address` (`city`, `street`, `house`, `apartment`, person_id) VALUES ('Minsk', 'Zavodskaya', '34', '11', 2);
