 drop table location if exists
 drop table manufacturer if exists
 drop table model if exists
 drop table modeltype if exists
 drop table product if exists
 drop sequence if exists hibernate_sequence
 create sequence hibernate_sequence start with 1 increment by 1
 create table location (id bigint not null, country varchar(255), state varchar(255), primary key (id))
 create table manufacturer (id bigint not null, active boolean, averageyearlysales decimal(19,2), foundeddate timestamp, name
varchar(255), headquarters_id bigint, location_id bigint, primary key (id))
 create table model (id bigint not null, frets integer not null, name varchar(255), price decimal(19,2), woodtype varchar(255),
yearfirstmade timestamp, manufacturer_id bigint, modeltype_id bigint, primary key (id))
 create table modeltype (id bigint not null, name varchar(255), primary key (id))
 create table product (id bigint not null, name varchar(255), price double, primary key (id))
 alter table manufacturer add constraint FKksvvct8b6uhjpqg9iq4x18hf4 foreign key (headquarters_id) references location
 alter table manufacturer add constraint FK25y5aw7rd1a67vh1tm3d3f35y foreign key (location_id) references location
 alter table model add constraint FK3q3dd1gats5au027tbdy4upfi foreign key (manufacturer_id) references manufacturer
 alter table model add constraint FKq02kwbgyniy3rctww1qduexuu foreign key (modeltype_id) references modeltype
