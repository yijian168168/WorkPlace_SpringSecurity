CREATE TABLE USERS(
id INT(4) NOT NULL PRIMARY KEY auto_increment,
username VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT null,
enabled boolean NOT NULL
);

INSERT INTO USERS(username,password,enabled) VALUES('qingrong','123456',TRUE);
INSERT INTO USERS(username,password,enabled) VALUES('xiaoqin','123456',TRUE);
INSERT INTO USERS(username,password,enabled) VALUES('lele','123456',FALSE);

select * from users;

drop table users;


create table authorities (
id INT(4) NOT NULL PRIMARY KEY auto_increment,
username varchar(50) not null,
authority varchar(50) not null
);

INSERT INTO authorities(username,authority) VALUES('qingrong','ADMIN');
INSERT INTO authorities(username,authority) VALUES('qingrong','PROVINCE');
INSERT INTO authorities(username,authority) VALUES('xiaoqin','PROVINCE');
INSERT INTO authorities(username,authority) VALUES('lele','PROVINCE');

select * from authorities;

drop table authorities;