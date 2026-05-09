CREATE TABLE IF NOT EXISTS product (
                                       id BIGINT NOT NULL AUTO_INCREMENT,
                                       name VARCHAR(255) NOT NULL,
                                       PRIMARY KEY (id)
);

INSERT INTO product (name) VALUES ('product 1');
INSERT INTO product (name) VALUES ('product 2');