# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table adult_effort (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  q21                       integer,
  q22                       integer,
  q23                       integer,
  q24                       integer,
  q25                       integer,
  q26                       integer,
  q27                       integer,
  q28                       integer,
  q29                       integer,
  q30                       integer,
  q31                       integer,
  q32                       integer,
  q33                       integer,
  q34                       integer,
  q35                       integer,
  created_date              timestamp not null,
  constraint pk_adult_effort primary key (id))
;

create table answer_choice (
  question_id               bigserial not null,
  name                      varchar(255),
  q_num                     integer,
  q1                        varchar(255),
  q2                        varchar(255),
  q3                        varchar(255),
  q4                        varchar(255),
  q5                        varchar(255),
  q6                        varchar(255),
  q7                        varchar(255),
  created_date              timestamp not null,
  constraint pk_answer_choice primary key (question_id))
;

create table bis_bas (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  created_date              timestamp not null,
  constraint pk_bis_bas primary key (id))
;

create table ikigai (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  created_date              timestamp not null,
  constraint pk_ikigai primary key (id))
;

create table panas (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  created_date              timestamp not null,
  constraint pk_panas primary key (id))
;

create table panas_q (
  question_id               bigserial not null,
  created_date              timestamp not null,
  constraint pk_panas_q primary key (question_id))
;

create table question (
  question_id               bigserial not null,
  name                      varchar(255),
  q_num                     integer,
  q1                        varchar(255),
  q2                        varchar(255),
  q3                        varchar(255),
  q4                        varchar(255),
  q5                        varchar(255),
  q6                        varchar(255),
  q7                        varchar(255),
  q8                        varchar(255),
  q9                        varchar(255),
  q10                       varchar(255),
  q11                       varchar(255),
  q12                       varchar(255),
  q13                       varchar(255),
  q14                       varchar(255),
  q15                       varchar(255),
  q16                       varchar(255),
  q17                       varchar(255),
  q18                       varchar(255),
  q19                       varchar(255),
  q20                       varchar(255),
  q21                       varchar(255),
  q22                       varchar(255),
  q23                       varchar(255),
  q24                       varchar(255),
  q25                       varchar(255),
  q26                       varchar(255),
  q27                       varchar(255),
  q28                       varchar(255),
  q29                       varchar(255),
  q30                       varchar(255),
  q31                       varchar(255),
  q32                       varchar(255),
  q33                       varchar(255),
  q34                       varchar(255),
  q35                       varchar(255),
  created_date              timestamp not null,
  constraint pk_question primary key (question_id))
;

create table resilience (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  q21                       integer,
  created_date              timestamp not null,
  constraint pk_resilience primary key (id))
;

create table self_disclosure (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  q21                       integer,
  q22                       integer,
  q23                       integer,
  q24                       integer,
  q2_1                      integer,
  q2_2                      integer,
  q2_3                      integer,
  q2_4                      integer,
  q2_5                      integer,
  q2_6                      integer,
  q2_7                      integer,
  q2_8                      integer,
  q2_9                      integer,
  q2_10                     integer,
  q2_11                     integer,
  q2_12                     integer,
  q2_13                     integer,
  q2_14                     integer,
  q2_15                     integer,
  q2_16                     integer,
  q2_17                     integer,
  q2_18                     integer,
  q2_19                     integer,
  q2_20                     integer,
  q2_21                     integer,
  q2_22                     integer,
  q2_23                     integer,
  q2_24                     integer,
  created_date              timestamp not null,
  constraint pk_self_disclosure primary key (id))
;

create table shintai (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        varchar(255),
  q2                        integer,
  q3                        integer,
  q4                        integer,
  created_date              timestamp not null,
  constraint pk_shintai primary key (id))
;

create table shintai_q (
  question_id               bigserial not null,
  created_date              timestamp not null,
  constraint pk_shintai_q primary key (question_id))
;

create table tac24 (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  q21                       integer,
  q22                       integer,
  q23                       integer,
  q24                       integer,
  created_date              timestamp not null,
  update_date               timestamp not null,
  constraint pk_tac24 primary key (id))
;

create table tipi_j (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  created_date              timestamp not null,
  update_date               timestamp not null,
  constraint pk_tipi_j primary key (id))
;

create table trust (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  q6                        integer,
  q7                        integer,
  q8                        integer,
  q9                        integer,
  q10                       integer,
  q11                       integer,
  q12                       integer,
  q13                       integer,
  q14                       integer,
  q15                       integer,
  q16                       integer,
  q17                       integer,
  q18                       integer,
  q19                       integer,
  q20                       integer,
  q21                       integer,
  q22                       integer,
  q23                       integer,
  q24                       integer,
  created_date              timestamp not null,
  update_date               timestamp not null,
  constraint pk_trust primary key (id))
;

create table user_model (
  user_id                   bigserial not null,
  user_name                 varchar(255),
  fin_count                 integer,
  is_fin                    boolean,
  status                    boolean,
  created_date              timestamp not null,
  update_date               timestamp not null,
  constraint pk_user_model primary key (user_id))
;

create table who5 (
  id                        bigserial not null,
  user_id                   bigint,
  q1                        integer,
  q2                        integer,
  q3                        integer,
  q4                        integer,
  q5                        integer,
  created_date              timestamp not null,
  constraint pk_who5 primary key (id))
;

create table who5q (
  question_id               bigserial not null,
  created_date              timestamp not null,
  constraint pk_who5q primary key (question_id))
;

alter table adult_effort add constraint fk_adult_effort_user_1 foreign key (user_id) references user_model (user_id);
create index ix_adult_effort_user_1 on adult_effort (user_id);
alter table bis_bas add constraint fk_bis_bas_user_2 foreign key (user_id) references user_model (user_id);
create index ix_bis_bas_user_2 on bis_bas (user_id);
alter table ikigai add constraint fk_ikigai_user_3 foreign key (user_id) references user_model (user_id);
create index ix_ikigai_user_3 on ikigai (user_id);
alter table panas add constraint fk_panas_user_4 foreign key (user_id) references user_model (user_id);
create index ix_panas_user_4 on panas (user_id);
alter table resilience add constraint fk_resilience_user_5 foreign key (user_id) references user_model (user_id);
create index ix_resilience_user_5 on resilience (user_id);
alter table self_disclosure add constraint fk_self_disclosure_user_6 foreign key (user_id) references user_model (user_id);
create index ix_self_disclosure_user_6 on self_disclosure (user_id);
alter table shintai add constraint fk_shintai_user_7 foreign key (user_id) references user_model (user_id);
create index ix_shintai_user_7 on shintai (user_id);
alter table tac24 add constraint fk_tac24_user_8 foreign key (user_id) references user_model (user_id);
create index ix_tac24_user_8 on tac24 (user_id);
alter table tipi_j add constraint fk_tipi_j_user_9 foreign key (user_id) references user_model (user_id);
create index ix_tipi_j_user_9 on tipi_j (user_id);
alter table trust add constraint fk_trust_user_10 foreign key (user_id) references user_model (user_id);
create index ix_trust_user_10 on trust (user_id);
alter table who5 add constraint fk_who5_user_11 foreign key (user_id) references user_model (user_id);
create index ix_who5_user_11 on who5 (user_id);



# --- !Downs

drop table if exists adult_effort cascade;

drop table if exists answer_choice cascade;

drop table if exists bis_bas cascade;

drop table if exists ikigai cascade;

drop table if exists panas cascade;

drop table if exists panas_q cascade;

drop table if exists question cascade;

drop table if exists resilience cascade;

drop table if exists self_disclosure cascade;

drop table if exists shintai cascade;

drop table if exists shintai_q cascade;

drop table if exists tac24 cascade;

drop table if exists tipi_j cascade;

drop table if exists trust cascade;

drop table if exists user_model cascade;

drop table if exists who5 cascade;

drop table if exists who5q cascade;

