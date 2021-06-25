DROP TABLE IF EXISTS users;

CREATE TABLE users(
    username VARCHAR PRIMARY KEY,
    user_password BYTEA
);

INSERT INTO users VALUES('catperson', '\x00'), ('dogperson', '\x00'), ('birdperson', '\x00');
