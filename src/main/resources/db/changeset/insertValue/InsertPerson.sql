--liquibase formatted sql
--changeset AlexFrost:insert-value-person

INSERT INTO `liquibase`.`persons` (`name`, `lastname`, `email`, `phone_number`) VALUES ('Alex', 'Frost', 'frost@gmail.com', '456456');
INSERT INTO `liquibase`.`persons` (`name`, `lastname`, `email`, `phone_number`) VALUES ('Vitalii', 'Olegov', 'Olegov@gmail.com', '67775');
INSERT INTO `liquibase`.`persons` (`name`, `lastname`, `email`, `phone_number`) VALUES ('Oleg', 'Popov', 'Popov@gmail.com', '768678');
INSERT INTO `liquibase`.`persons` (`name`, `lastname`, `email`, `phone_number`) VALUES ('Artem', 'Tikaev', 'Tikaev@gmail.com', '75734');
