-- posts, springboot_aws_solo_posts
create table springboot_aws_solo_posts
(
    id      bigint not null auto_increment,
    created_date datetime,
    modified_date datetime,
    author  varchar(255),
    content TEXT         not null,
    title   varchar(500) not null,
    primary key (id)
) engine=InnoDB;

-- user, springboot_aws_solo_user
create table springboot_aws_solo_user
(
    id            bigint not null auto_increment,
    created_date  datetime,
    modified_date datetime,
    email         varchar(255) not null,
    name          varchar(255) not null,
    picture       varchar(255),
    role          varchar(255) not null,
    primary key (id)
) engine=InnoDB;