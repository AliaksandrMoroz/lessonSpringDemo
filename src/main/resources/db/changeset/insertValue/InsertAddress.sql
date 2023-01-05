--liquibase formatted sql
--changeset AlexFrost:insert-value-person

INSERT INTO `liquibase`.`address` (`city`, `street`, `house`, `apartment`, person_id) VALUES ('Minsk', 'Oktyaborskaya', '12', '45', 1);
