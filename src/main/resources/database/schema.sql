create table if not exists articles (
    id bigserial primary key,
    title varchar(100),
    short_text varchar(100),
    main_text varchar(100),
    author varchar(100),
    creation_date_time timestamp,
    update_date_time timestamp
);