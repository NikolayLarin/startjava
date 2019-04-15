-- DELETE FROM jaegers;                             очистить всю таблицу
-- ALTER SEQUENCE jaegers_id_seq RESTART WITH 1;    назначить автоинкременту единицу
-- SELECT * FROM jaegers;                           вывести все строки таблицы
--\i init_db.sql

insert into jaegers (modelName, mark, height, weight, status, origin, launch, kaijuKill)
values
    ('Obsidian Furyi',  'Mark-2', 71.3,  1765.1, 'Destroyed', 'USA',       '2018-09-25', 2),
    ('Striker Eureka', 'Mark-5', 76.2,  1850.0, 'Destroyed', 'Australia', '2019-11-02', 2),
    ('Bracer Phoenix', 'Mark-5', 70.91, 2128.0, 'Destroyed', 'China',     '2025-11-01', 1),
    ('Brawler Yukon',  'Mark-1', 69.32, 1858.0, 'Destroyed', 'USA',       '2015-01-30', 2),
    ('Cherno Alpha',   'Mark-1', 85.34, 2412.0, 'Destroyed', 'Russia',    '2015-01-01', 4),
    ('Chrome Brutus',  'Mark-3', 70.05, 1651.5, 'Destroyed', 'Canada',    '2017-01-01', 0),
    ('Guardian Bravo', 'Mark-6', 73.21, 1975.0, 'Destroyed', 'Russia',    '2033-12-15', 1),
    ('Titan Redeemer', 'Mark-6', 68.35, 1829.3, 'Active',    'China',     '2025-03-18', 1),
    ('Saber Athena',   'Mark-7', 76.91, 1628.0, 'Destroyed', 'Russia',    '2033-12-20', 1),
    ('November Ajax',  'Mark-6', 78.94, 1899.5, 'Active',    'Russia',    '2025-11-16', 1);