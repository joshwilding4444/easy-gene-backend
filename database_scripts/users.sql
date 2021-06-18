DROP TABLE IF EXISTS users;

CREATE TABLE users(
    userid INT PRIMARY KEY,
    username VARCHAR,
    user_password BYTEA
);

INSERT INTO users VALUES(1, 'catperson', '\x00'), (2, 'dogperson', '\x00'), (3, 'birdperson', '\x00');
