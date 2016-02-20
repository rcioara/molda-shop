create table photo (
    id INT NOT NULL AUTO_INCREMENT,
    name varchar(100),
    width INT,
    height INT,
    data BLOB,
    mime_type varchar(50),
    PRIMARY KEY(id)
);