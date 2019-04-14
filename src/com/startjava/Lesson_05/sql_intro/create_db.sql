-- psql -U postgres
-- \i create_db.sql     - считываем и выполняем команды из заданного файла
-- \c jaegers;          - подключаемся к базе jaegers  
-- неплохое введение тут: https://metanit.com/sql/postgresql/1.1.php

CREATE DATABASE Jaegers;

\c jaegers;

CREATE TABLE jaegers
(
    id         SMALLSERIAL PRIMARY KEY,        -- идентийикатор с автоинкрементом
    modelName  VARCHAR(50),                    -- имя робота
    mark       VARCHAR(20),                    -- модель робота
    height     NUMERIC(5, 2),                  -- высота робота, м
    weight     NUMERIC(6, 2),                  -- масса робота, т
    status     VARCHAR(20),                    -- статус
    origin     VARCHAR(20),                    -- страна производства
    launch     DATE,                           -- ввод в эксплуатацию, гггг-мм-дд
    kaijuKill  INTEGER                         -- количество убитых кадзю
);