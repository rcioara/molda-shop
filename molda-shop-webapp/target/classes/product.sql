create table product(
    id INT NOT NULL AUTO_INCREMENT,
    name varchar(100),
    description varchar(255),
    price DECIMAL (5, 2),
    count INT,
    photo_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (photo_id) REFERENCES photo(id)
);