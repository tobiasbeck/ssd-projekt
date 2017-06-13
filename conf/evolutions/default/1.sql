# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  user_id                       bigint auto_increment not null,
  email                         varchar(255),
  password                      varchar(255),
  name                          varchar(255),
  position                      varchar(255),
  constraint pk_user primary key (user_id)
);


# --- !Downs

drop table if exists user;

