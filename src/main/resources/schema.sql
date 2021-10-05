create table Speaker (
      speaker_id int primary key,
      speaker varchar(200) not null,
      store varchar(200) not null,
      image_file_name varchar(200)
);

create table Location (
    location_id int primary key,
    name varchar(200) not null,
    country varchar(50) not null
);

create table Sighting (
    sale_id identity,
    speaker_id int not null,
    buyer_name varchar(200) not null,
    location_id int not null,
    count int not null default 0,
    bought_at timestamp not null
);

alter table Sighting
    add foreign key (speaker_id) references Speaker(speaker_id);

alter table Sighting
    add foreign key (location_id) references Location(location_id);