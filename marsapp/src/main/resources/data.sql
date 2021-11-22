drop table if  exists martian;

create table martian
(
    martian_id int auto_increment
        primary key,
    first_name varchar(32) null,
    last_name  varchar(32) null,
    base_id    int         null,
    super_id   int         null
);

INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (1, 'Ray', 'Bradbury', 1, null);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (2, 'John', 'Black', 4, 10);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (3, 'Samuel', 'Minkston', 4, 2);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (4, 'Jeff', 'Spender', 1, 9);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (5, 'Sam', 'Parkhill', 2, 12);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (6, 'Elma', 'Parkhill', 3, 8);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (7, 'Melissa', 'Lewis', 1, 1);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (8, 'Mark', 'Watney', 3, null);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (9, 'Beth', 'Johanssen', 1, 1);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (10, 'Chris', 'Beck', 4, null);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (11, 'Nathaniel', 'York', 4, 2);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (12, 'Elon', 'Musk', 2, null);
INSERT INTO martian (martian_id, first_name, last_name, base_id, super_id) VALUES (13, 'John', 'Carter', null, 8);