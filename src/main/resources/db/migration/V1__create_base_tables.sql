CREATE TABLE users (
                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE tag (
                     id BIGINT AUTO_INCREMENT PRIMARY KEY,
                     name VARCHAR(255) NOT NULL,
                     tag_type VARCHAR(255) NOT NULL
);

CREATE TABLE address (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         street VARCHAR(255) NOT NULL,
                         city VARCHAR(255) NOT NULL,
                         zip VARCHAR(255) NOT NULL,
                         state VARCHAR(255) NOT NULL,
                         user_id BIGINT
);

CREATE TABLE profile (
                         id BIGINT PRIMARY KEY,
                         bio VARCHAR(255) NOT NULL,
                         phone_number VARCHAR(255) NOT NULL,
                         date_of_birth DATE NOT NULL,
                         loyalty_point INT NOT NULL,
                         user_id BIGINT UNIQUE
);