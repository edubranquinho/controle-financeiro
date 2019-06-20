docker run --name teste-postgres --network=postgres-network -e "POSTGRES_USER=admin" -e "POSTGRES_PASSWORD=admin"  -e "POSTGRES_DB=database"  -p 5432:5432  -d postgres


CREATE SCHEMA financeiro;
SHOW search_path;
SET search_path TO financeiro;

select * from pg_tables where schemaname='financeiro';

CREATE TABLE conta_fixa(
        id serial PRIMARY KEY,
        nome VARCHAR (50) UNIQUE NOT NULL
);