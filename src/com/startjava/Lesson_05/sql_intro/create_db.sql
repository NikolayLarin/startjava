-- \i create_db.sql     - считываем и выполняем команды из заданного файла
-- \c jaegers;          - подключаемся к базе jaegers  
-- неплохое введение тут: https://metanit.com/sql/postgresql/1.1.php
-- psql -U postgres

create DATABASE jaegers;

\c jaegers;

create TABLE jaegers(
    id        SMALLSERIAL PRIMARY KEY,
    modelName VARCHAR(50),
    mark      VARCHAR(20),
    height    NUMERIC(5, 2),
    weight    NUMERIC(6, 2),
    status    VARCHAR(20),
    origin    VARCHAR(20),
    launch    DATE,
    --DATE: yyyy-mm-dd
    kaijuKill INTEGER;