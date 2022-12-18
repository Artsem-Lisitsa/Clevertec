create table if not exists product
(
    id    serial
    primary key,
    name  varchar(255) not null,
    price double precision,
    stock integer      not null
    );
insert into product(name, price, stock) values ('Hotdog',5.34,0);
insert into product(name, price, stock) values ('Tomato',6.99,1);
insert into product(name, price, stock) values ('Potato',15.34,1);
insert into product(name, price, stock) values ('Cherry',12.22,0);

alter table product
    owner to postgres;

create table if not exists discount_card
(
    id       serial
    primary key,
    number   integer not null
    unique,
    discount integer not null
);
insert into discount_card(number, discount) values (1234,10);
insert into discount_card(number, discount) values (1526,5);
insert into discount_card(number, discount) values (2121,15);

alter table discount_card
    owner to postgres;

