-- auto-generated definition
create table martian
(
    martian_id int auto_increment
        primary key,
    first_name varchar(32) null,
    last_name  varchar(32) null,
    base_id    int         null,
    super_id   int         null
)
    comment 'All people living on Mars';
