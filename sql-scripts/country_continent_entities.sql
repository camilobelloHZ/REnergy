create table public.entities
(
    id          bigserial primary key,
    name        varchar not null,
    is_country  boolean not null
);

alter table public.entities owner to postgres;
