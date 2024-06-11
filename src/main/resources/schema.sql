create schema if not exists security;

create table if not exists security.user (
    id bigserial not null,
    username varchar(55) not null,
    password text not null,
    algorithm varchar(55) not null,
    primary key (id)
);

create table if not exists security.authority (
    id bigserial not null,
    name varchar(55) not null,
    user_id bigint not null,
    primary key (id)
);

create table if not exists security.product (
    id bigserial not null,
    name varchar(55) not null,
    price decimal(10, 2) not null,
    currency varchar(55) not null,
    primary key (id)
);