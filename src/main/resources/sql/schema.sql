-- posts, springboot_aws_solo_posts
drop table if exists springboot_aws_solo_posts cascade;

create table springboot_aws_solo_posts
(
    id      bigint generated by default as identity,
    title   varchar(500) not null,
    author  varchar(255),
    content TEXT         not null,
    primary key (id)
);

-- user, springboot_aws_solo_user
drop table if exists springboot_aws_solo_user cascade;

create table springboot_aws_solo_user
(
    created_date  timestamp(6),
    id            bigint generated by default as identity,
    modified_date timestamp(6),
    email         varchar(255) not null,
    name          varchar(255) not null,
    picture       varchar(255),
    role          enum ('GUEST','USER') not null,
    primary key (id)
)