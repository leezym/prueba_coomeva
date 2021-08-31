-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2021-08-31 17:51:25.712

-- tables
-- Table: clientes
CREATE TABLE clientes (
    clients_id int NOT NULL,
    last_name varchar(50) NOT NULL,
    email varchar(50) NOT NULL,
    cellphone int NOT NULL,
    users_user_id int NOT NULL,
    CONSTRAINT clientes_pk PRIMARY KEY (clients_id)
);

-- Table: users
CREATE TABLE users (
    user_id int NOT NULL,
    username varchar(50) NOT NULL,
    password varchar(50) NOT NULL,
    enabled bool NOT NULL,
    CONSTRAINT users_pk PRIMARY KEY (user_id)
);

-- foreign keys
-- Reference: clientes_users (table: clientes)
ALTER TABLE clientes ADD CONSTRAINT clientes_users FOREIGN KEY clientes_users (users_user_id)
    REFERENCES users (user_id);

-- End of file.

