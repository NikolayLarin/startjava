-- psql -U postgres
-- \i _clear_table_db.sql

\c jaegers;

DELETE FROM jaegers;                             -- очистить всю таблицу
ALTER SEQUENCE jaegers_id_seq RESTART WITH 1;    -- назначить автоинкременту единицу
SELECT * FROM jaegers;                           -- вывести все строки таблицы