DROP TABLE IF EXISTS FILMS;

CREATE TABLE FILMS (
                              ID INT AUTO_INCREMENT PRIMARY KEY,
                              NAME VARCHAR(250) NOT NULL,
                              AUTHOR VARCHAR(250) NOT NULL,
                              GENRE VARCHAR(250) DEFAULT NULL
);

INSERT INTO FILMS (NAME, AUTHOR, GENRE) VALUES
('Aliko', 'Dangote', 'ACTION'),
('Bill', 'Gates', 'COMEDY'),
('Folrunsho', 'Alakija', 'SCARE');