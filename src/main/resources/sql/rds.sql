# Select Database
             # show databases ;
# use AWS RDS 데이터베이스명;

# Check Character Setting
# show variables like 'character_set%';
# show variables like 'collation%';

# Alter Character Setting
# alter databases AWS RDS 데이터베이스명
# character set = 'utf8mb4'
# collate = 'utf8mb4_general_ci';

# Check Timezone
# select @@time_zone, now();

# create table test (
                        #     id bigint(20) not null auto_increment,
                        #     content varchar(255) default null,
                        #     primary key (id)
                            # ) engine=InnoDB;
#
# insert into test(content) values ('테스트');
#
# select * from test;

-- posts, springboot_aws_solo_posts
# create table springboot_aws_solo_posts
    # (
          #     id      bigint not null auto_increment,
          #     created_date datetime,
          #     modified_date datetime,
          #     author  varchar(255),
    #     content TEXT         not null,
    #     title   varchar(500) not null,
    #     primary key (id)
    # ) engine=InnoDB;

-- user, springboot_aws_solo_user
# create table springboot_aws_solo_user
    # (
          #     id            bigint not null auto_increment,
          #     created_date  datetime,
          #     modified_date datetime,
          #     email         varchar(255) not null,
    #     name          varchar(255) not null,
    #     picture       varchar(255),
    #     role          varchar(255) not null,
    #     primary key (id)
    # ) engine=InnoDB;

# CREATE TABLE SPRING_SESSION (
                                  #                                 PRIMARY_ID CHAR(36) NOT NULL,
                                  #                                 SESSION_ID CHAR(36) NOT NULL,
                                  #                                 CREATION_TIME BIGINT NOT NULL,
                                  #                                 LAST_ACCESS_TIME BIGINT NOT NULL,
                                  #                                 MAX_INACTIVE_INTERVAL INT NOT NULL,
                                  #                                 EXPIRY_TIME BIGINT NOT NULL,
                                  #                                 PRINCIPAL_NAME VARCHAR(100),
                                  #                                 CONSTRAINT SPRING_SESSION_PK PRIMARY KEY (PRIMARY_ID)
                                      # ) ENGINE=InnoDB ROW_FORMAT=DYNAMIC;
#
# CREATE UNIQUE INDEX SPRING_SESSION_IX1 ON SPRING_SESSION (SESSION_ID);
# CREATE INDEX SPRING_SESSION_IX2 ON SPRING_SESSION (EXPIRY_TIME);
# CREATE INDEX SPRING_SESSION_IX3 ON SPRING_SESSION (PRINCIPAL_NAME);
#
# CREATE TABLE SPRING_SESSION_ATTRIBUTES (
                                             #                                            SESSION_PRIMARY_ID CHAR(36) NOT NULL,
                                             #                                            ATTRIBUTE_NAME VARCHAR(200) NOT NULL,
                                             #                                            ATTRIBUTE_BYTES BLOB NOT NULL,
                                             #                                            CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (SESSION_PRIMARY_ID, ATTRIBUTE_NAME),
                                             #                                            CONSTRAINT SPRING_SESSION_ATTRIBUTES_FK FOREIGN KEY (SESSION_PRIMARY_ID) REFERENCES SPRING_SESSION(PRIMARY_ID) ON DELETE CASCADE
                                                 # ) ENGINE=InnoDB ROW_FORMAT=DYNAMIC;

select * from springboot_aws_solo_posts;
insert into springboot_aws_solo_posts (author, content, title) values ('author', 'content', 'title');
