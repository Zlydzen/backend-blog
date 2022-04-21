create table article(
    id serial not null,
    title varchar,
    short_text varchar,
    main_text varchar,
    author varchar,
    creation_date_time timestamp,
    update_date_time timestamp
);