USE codeup_test_db;

CREATE TABLE authors (
                         id INT NOT NULL AUTO_INCREMENT,
                         name VARCHAR(70) NOT NULL,
                         PRIMARY KEY (id)
);
INSERT INTO authors (name)
VALUES
    ('William Shakespeare'),
    ('Dr. Dre'),
    ('Nas'),
    ('Biggie Smalls'),
    ('Malcolm X');

