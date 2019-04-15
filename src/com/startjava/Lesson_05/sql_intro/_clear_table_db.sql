-- \ psql -U postgres
-- \i _clear_table_db.sql

\c jaegers;

delete from jaegers;
-- очистить всю таблицу
alter sequence jaegers_id_seq RESTART with 1;
-- назначить автоинкременту единицу
select * from jaegers;
-- вывести все строки таблицы